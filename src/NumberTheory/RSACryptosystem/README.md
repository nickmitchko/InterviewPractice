# RSA Public-Key Cryptosystem

RSA is an asymmetric encryption algorithm that is mostly phased out of modern day encryption key exchange algorithms.
The algorithm uses a public and private key and modulus math to excahnge private information over an open channel with perfect forward secrecy.

### Algorithm

1. Select at random two large prime numbers p and q such that p ≠ q. The primes
   p and q might be, say, 1024 bits each.
2. Compute n = pq
3. Select a small odd integer e that is relatively prime to 𝜙(n); e = (p-1)(q-1)
4. Compute d as the multiplicative inverse of e, modulo 𝜙(n).
5. Publish the pair *P = (e, n)* as **RSA Public Key**
6. Keep secret *S = (d, n)* as **RSA Secret Key**

* **Encryption:** P(M) = M^e mod n
* **Decryption:** S(C) = C^d mod n