Rahul wants to buy ice creams from each shop in the neighbourhood.
 There are N different ice creams sellers in a line.
 Three flavours of ice cream: vanilla, chocolate and strawberry are available with every seller but at different prices.
 Rahul wants to buy exactly one ice-cream from one shop and 
 avoid buying the same ice-cream from adjacent shops. 
 If the cost of each ice-cream in each shop is provided in a Nx3 matrix,
 Calculate the minimum amount of money that Rahul must spend after he visits every shop.

 Example: Input: N = 3 cost = {{1, 50, 50},
                               {50, 50, 50},
							   {1, 50, 50}} Output: 52


 Explanation: Shop 1: Buy vanilla for Rs 1. 
 Shop 2: Buy chocolate or strawberry for Rs 50. 
 Shop 3: Buy vanilla for Rs 1. Total = 1+50+1 = 52
 
 cost = {{1, 50, 50},   1            50       52
        {1, 50, 60},     50          1
       {4, 1, 50}}        4       55     1


 Your Task: Take input from the user for N and the cost of each ice cream in N stores,and store in a Nx3 matrix.
 Then write a function which takes N and Nx3 matrix as input parameters and returns the minimum amount 
 of money that Rahul must spend.
