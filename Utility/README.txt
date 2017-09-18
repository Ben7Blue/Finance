A program that I created so that I can quickly distribute the house utility bill between my roommates.

The Idea of this program was to distribute the house utility bill based on the amount of days
	the tenants used.

The amount of day used were gotten from the day after the tenant arrived to the end of the month.

The way the math works:

======================================
First, the Data Needed
======================================

Tenant 1: 30 days out of 30
Tenant 2: 10 days out of 30
Tennat 3: 25 days out of 30

Total Bill: $200.00

======================================
Calculation
======================================

We first get the total percentage by adding the percentage used in decimal
	Well, I say percentage for the lack of a better word.
	=I seriously do not know how to explain this part properly but the math checks out.

Tenant 1: 30/30 = 1.0000
Tenant 2: 10/30 = 0.3333
Tenant 3: 25/30 = 0.8333

=======
Now Add them
=======

1.0000 + 0.3333 + 0.8333 = 2.1666
Total Percentage = 2.1666

======================================
Bill Distribution
======================================

(Percentage Used from the Tenant)/(Total Percentage) * (Total Bill) = The amount that Tenant must pay

Tenant 1: 1.0000/2.1666 * 200.00 = 92.3105326318
Tenant 2: 0.3333/2.1666 * 200.00 = 30.7671005
Tenant 3: 0.8333/2.1666 * 200.00 = 76.9223668421

The sum of the distributed payment will equal to 200 while rounding them at the lowest possible coinage decimal
