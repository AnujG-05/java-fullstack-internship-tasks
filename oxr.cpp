#include <bits/stdc++.h>
using namespace std;

typedef long long ll;
const int MOD = 30011;
const double PI = acos(-1.0);
using cd = complex<double>;

void fft(vector<cd>& a, bool inv) {
    int n = a.size();
    for (int i = 1, j = 0; i < n; ++i) {
        int bit = n >> 1;
        for (; j >= bit; bit >>= 1) j -= bit;
        j += bit;
        if (i < j) swap(a[i], a[j]);
    }
    for (int len = 2; len <= n; len <<= 1) {
        double ang = 2 * PI / len * (inv ? -1 : 1);
        cd wlen(cos(ang), sin(ang));
        for (int i = 0; i < n; i += len) {
            cd w(1);
            for (int j = 0; j < len / 2; ++j) {
                cd u = a[i + j], v = a[i + j + len / 2] * w;
                a[i + j] = u + v;
                a[i + j + len / 2] = u - v;
                w *= wlen;
            }
        }
    }
    if (inv) for (auto& x : a) x /= n;
}

vector<ll> multiply(const vector<ll>& aa, const vector<ll>& bb) {
    int na = aa.size(), nb = bb.size();
    int n = 1;
    while (n < na + nb) n <<= 1;
    vector<cd> fa(n), fb(n);
    for (int i = 0; i < na; ++i) fa[i] = cd(aa[i], 0);
    for (int i = 0; i < nb; ++i) fb[i] = cd(bb[i], 0);
    fft(fa, false); fft(fb, false);
    for (int i = 0; i < n; ++i) fa[i] *= fb[i];
    fft(fa, true);
    vector<ll> res(na + nb - 1);
    for (int i = 0; i < (int)res.size(); ++i) res[i] = llround(fa[i].real());
    return res;
}

ll mod_pow(ll a, ll b, ll m) {
    ll res = 1;
    a %= m;
    while (b) {
        if (b & 1) res = res * a % m;
        a = a * a % m;
        b >>= 1;
    }
    return res;
}

ll find_primitive_root(ll pp) {
    if (pp == 2) return 1;
    vector<ll> fac;
    ll phi = pp - 1, n = phi;
    for (ll i = 2; i * i <= n; ++i) {
        if (n % i == 0) {
            fac.push_back(i);
            while (n % i == 0) n /= i;
        }
    }
    if (n > 1) fac.push_back(n);
    for (ll g = 2; g < pp; ++g) {
        bool ok = true;
        for (ll f : fac) if (mod_pow(g, phi / f, pp) == 1) { ok = false; break; }
        if (ok) return g;
    }
    assert(false);
    return -1;
}

vector<ll> add_conv(const vector<ll>& aa, const vector<ll>& bb, int pp) {
    int n = 1;
    while (n < pp * 2) n <<= 1;
    vector<ll> pa(n, 0LL), pb(n, 0LL);
    for (int i = 0; i < pp; ++i) pa[i] = aa[i];
    for (int i = 0; i < pp; ++i) pb[i] = bb[i];
    auto bigres = multiply(pa, pb);
    vector<ll> res(pp, 0LL);
    for (int i = 0; i < pp; ++i) {
        ll val = bigres[i];
        if (i + pp < (int)bigres.size()) val += bigres[i + pp];
        res[i] = (val % MOD + MOD) % MOD;
    }
    return res;
}

vector<ll> mul_conv(const vector<ll>& aa, const vector<ll>& bb, int pp, ll groot, const vector<int>& dlog) {
    if (pp == 2) {
        ll w00 = aa[0] * bb[0] % MOD;
        ll w01 = aa[0] * bb[1] % MOD;
        ll w10 = aa[1] * bb[0] % MOD;
        ll w11 = aa[1] * bb[1] % MOD;
        vector<ll> res(2, 0);
        res[0] = (w00 + w01 + w10) % MOD;
        res[1] = w11 % MOD;
        return res;
    }
    ll tota = 0, totb = 0, za = aa[0], zb = bb[0];
    for (int i = 0; i < pp; ++i) {
        tota = (tota + aa[i]) % MOD;
        totb = (totb + bb[i]) % MOD;
    }
    vector<ll> res(pp, 0LL);
    ll zways = (za * totb + tota * zb - za * zb % MOD + 2LL * MOD) % MOD;
    res[0] = zways;
    int phii = pp - 1;
    int n = 1;
    while (n < phii * 2) n <<= 1;
    vector<ll> la(phii, 0LL), lb(phii, 0LL);
    for (int v = 1; v < pp; ++v) {
        la[dlog[v]] = (la[dlog[v]] + aa[v]) % MOD;
        lb[dlog[v]] = (lb[dlog[v]] + bb[v]) % MOD;
    }
    vector<ll> pa(n, 0LL), pb(n, 0LL);
    for (int i = 0; i < phii; ++i) pa[i] = la[i];
    for (int i = 0; i < phii; ++i) pb[i] = lb[i];
    auto bigres = multiply(pa, pb);
    vector<ll> lconv(phii, 0LL);
    for (int i = 0; i < phii; ++i) {
        ll val = bigres[i];
        if (i + phii < (int)bigres.size()) val += bigres[i + phii];
        lconv[i] = (val % MOD + MOD) % MOD;
    }
    ll curval = 1LL;
    for (int i = 0; i < phii; ++i) {
        res[curval] = (res[curval] + lconv[i]) % MOD;
        curval = curval * groot % pp;
    }
    return res;
}

vector<ll> parse_atom(int& pos, const string& s, int pp, ll groot, const vector<int>& dlog);
vector<ll> parse_pow(int& pos, const string& s, int pp, ll groot, const vector<int>& dlog);
vector<ll> parse_mul(int& pos, const string& s, int pp, ll groot, const vector<int>& dlog);
vector<ll> parse_add(int& pos, const string& s, int pp, ll groot, const vector<int>& dlog);

vector<ll> parse_add(int& pos, const string& s, int pp, ll groot, const vector<int>& dlog) {
    auto cur = parse_mul(pos, s, pp, groot, dlog);
    while (pos < (int)s.size() && s[pos] == '+') {
        ++pos;
        auto nxt = parse_mul(pos, s, pp, groot, dlog);
        cur = add_conv(cur, nxt, pp);
    }
    return cur;
}

vector<ll> parse_mul(int& pos, const string& s, int pp, ll groot, const vector<int>& dlog) {
    auto cur = parse_pow(pos, s, pp, groot, dlog);
    while (pos < (int)s.size() && s[pos] == '*') {
        ++pos;
        auto nxt = parse_pow(pos, s, pp, groot, dlog);
        cur = mul_conv(cur, nxt, pp, groot, dlog);
    }
    return cur;
}

vector<ll> parse_pow(int& pos, const string& s, int pp, ll groot, const vector<int>& dlog) {
    auto cur = parse_atom(pos, s, pp, groot, dlog);
    while (pos < (int)s.size() && s[pos] == '^') {
        ++pos;
        auto expdist = parse_pow(pos, s, pp, groot, dlog);
        int expo = 0;
        for (int i = 0; i < pp; ++i) if (expdist[i]) expo = i;
        vector<ll> nw(pp, 0LL);
        for (int v = 0; v < pp; ++v) {
            if (cur[v] == 0) continue;
            ll powered = mod_pow(v, expo, pp);
            nw[powered] = (nw[powered] + cur[v]) % MOD;
        }
        cur = nw;
    }
    return cur;
}

vector<ll> parse_atom(int& pos, const string& s, int pp, ll groot, const vector<int>& dlog) {
    char ch = s[pos];
    vector<ll> dist(pp, 0LL);
    if (isdigit(ch)) {
        int dig = ch - '0';
        dist[dig % pp] = 1;
        ++pos;
    } else if (islower(ch)) {
        fill(dist.begin(), dist.end(), 1LL);
        ++pos;
    } else if (ch == '(') {
        ++pos;
        dist = parse_add(pos, s, pp, groot, dlog);
        ++pos; // )
    }
    return dist;
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
    int p;
    cin >> p;
    string expr;
    cin >> expr;
    ll proot = find_primitive_root(p);
    vector<int> dlog(p, 0);
    ll cur = 1;
    for (int k = 0; k < p - 1; ++k) {
        dlog[cur] = k;
        cur = cur * proot % p;
    }
    int position = 0;
    auto final_dist = parse_add(position, expr, p, proot, dlog);
    cout << final_dist[0] << '\n';
    return 0;
}