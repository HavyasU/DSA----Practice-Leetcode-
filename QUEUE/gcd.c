int gcd(a, b)
{
    if (b == 0)
        return a;
    int rem = a % b;
    return gcd(b, rem);
}

void main()
{
    printf("GDC of 24,48", gcd(24, 48));
}