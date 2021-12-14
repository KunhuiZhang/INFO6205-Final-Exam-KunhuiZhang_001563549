# Section-02-Final-Exam

Given a number of nodes and a list of connected pairs, determine the weights of each connected component assuming each node weighs 1 unit. Then for each weight calculated, square and return the final sum.

 

Example

graph_nodes = 10

graph_from = [1, 1, 2, 3, 7]

graph_to = [2, 3, 4, 5, 8]

 ![alt text](https://github.com/INFO6205-Fall2021/Section-02-Final-Exam/blob/main/img.svg)

 

There are 2 isolated sets with more than one node, {1, 2, 3, 4, 5} and {7, 8}. Their squares are 5*5=25 and 2*2=4.  The other three isolated nodes their square are 1,1 & 1 respectively.   The sum is 25 + 4 + (3 * 1) = 32.

You need to implement the connectedSquareSum function in Solution.java. The function should return an int values that denotes the calculation explained above. The tests have been implmented in SolutionTests.java. Make sure all the test cases run successfully.

 

Constraints:

1 ≤ graph_nodes ≤ 1000<br>
0 ≤ graph_from[i], graph_to[i] ≤ n
