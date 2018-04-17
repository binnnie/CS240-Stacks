1. We created a Main.java file to test the Stacks. We pushed and popped multiple times, tested to make sure the data was correct
at each step. We also used the Reverse.java file with sox to try reversing sound files.
2. a. with 1 million: 20 times
b. with 1 billion: 30 times
c. with 1 trillion: 40 times
We used log base 2 of the number of elements in the input to find our answer for how many times it resized.
3. assume our data queue is called "data"
push: enqueue(number)
pop: new queue data2
loop through data size - 1 times
    data2 enqueue(data.pop())
hold = data.pop
data = data2
return hold
4. With the queue implementation it will always be constant time to push something onto the stack whereas with the array
implementation it will occasionally have to resize the array causing it to take n time for that operation. We would
still choose the array implementation because this case is relatively rare and will only happen log(n) times per input
along with this, the array implementation is much more efficient at popping data because it does not have to utilize
another queue causing it to take n time every single pop.
5. It was fun to explore different methods to implement a data structure we use frequently. We did not enjoy debugging
our toString method which turned out to break our entire ListStack. We could have wrote a working toString to begin with
(or no toString).
6. We think it was fine, overall good assignment.