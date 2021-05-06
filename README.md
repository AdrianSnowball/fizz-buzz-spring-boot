##Spring Boot FizzBuzz Sample

###Architecture

In order to demonstrate using Spring and Spring Boot I used the Spring Initializr 
site to create the basic files for the project.

###Testing Approach

To demonstrate that this is being test driven I intend to commit the files as often as I have
passing tests so that you can look into the git history and see the code evolve. I have left 
the empty provided Spring initializr test in situ. I have been criticised for this in the past
for other remote coding exercises. The reason I leave it in is not due to being lazy, it is 
because whilst the test is empty it is still a legitimate test. If the application context fails
to load, then the test fails, I consider this a valid integration test.

For micro services that expose RESTful endpoints I usually start off with a black box
functional test that externally makes the request and asserts on the response. I then start
writing the code by test driving it with Unit tests that emerge a design.

####Significant Commit 1

This is the point where I have a passing functional test it simply asserts the endpoint is up 
and returning a OK response.

####Significant Commit 2

Now I am test driving using red green refactor and have a green test. Normally I would have written a degenerate or 
edge case test first but because the criteria is clear that we will only ever send ints 1..100 there are none I can 
think of. I have written the smallest amount of code to pass the test. 

####Significant Commit 3

Minimum code for getting input of 3 working.

####Significant Commit 4

Parameterized test for multiples of 3.

####Significant Commit 5

Refactoring for readability.
