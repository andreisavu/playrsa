#! /usr/bin/jython

import sys

from java.math import BigInteger
from java.util import Random
from java.lang import ArithmeticException

randomizer = Random()

def get_probable_prime(bits):
    return BigInteger.probablePrime(bits/2, randomizer)

if __name__ == '__main__':
    bits = 32

    P = get_probable_prime(bits/2)
    Q = get_probable_prime(bits/2)
    print 'P: %s, Q: %s' % (P, Q)

    N = P.multiply(Q)
    print 'N: %s' % N

    one = BigInteger("1")
    Euler = P.subtract(one).multiply(Q.subtract(one))
    print 'Euler: %s' % Euler

    E = BigInteger("17")
    print 'E: %s' % E

    try:
        D = E.modInverse(Euler)
        print 'D: %s' % D
    except ArithmeticException:
        print >>sys.stderr, 'Failed. E is not invertible'
        sys.exit(1)

    msg = 'A test message'
    print 'Original message: %s' % msg

    result = []
    for ch in msg:
        result.append(BigInteger.valueOf(ord(ch)).modPow(E, N))
    print 'Encrypted: %s' % result

    decrypted = ''
    for el in result:
        decrypted += chr(BigInteger(str(el)).modPow(D, N).intValue())
    print 'Decrypted: %s' % decrypted


