PaymentProcessor is a class responsible for processing payments. As you can see the class will be hard to maintain and extend.
You can see in the main class, to process payment, each time we will have to create a PaymentProcessor instance at run time with
different parameters.

Use the Strategy pattern to make this PaymentProcessor class more maintainable and flexible.

Hint:
- Best to create each payment method as a class (e.g. CreditCardPayment, PayPalPayment, etc.)