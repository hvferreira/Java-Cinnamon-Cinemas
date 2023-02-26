# Cinnamon Cinemas

Develop a program to allocate seats to customers purchasing tickets for a movie theatre. This was developed in Java 17.

## Key Features of Solution

Classes: Seat, Customer, Payment, Ticket, Movie, Cinnamon, TheatreRoom
Attributes: 15 seats, 3 rows, 5 columns
Restrictions: Max 15 seats per room, one to three tickets that customer can buy at random.

## Assumptions

Program that allocates seats based on a random integer “number of seats” between 1 and 3.
Allocate the required number of seats from the available seats starting from seat A1 and filling the auditorium from
left to right and front to back.
All seats available when the program starts.
Continues to allocate a random number of seats until it finds there are not enough seats left to complete the request.
When there are not enough seats to be allocated the program can halt.

## Approaches

Read description.
Verified what are classes, attributes and restrictions.
Designed UML.
Started creating tests for each condition.
Assure all tests passed and committed for each test completed.

## UML

![This is an image] (https://github.com/hvferreira/Java-Cinnamon-Cinemas/blob/master/src/UML/uml.png)

## Future Thoughts

Use Java payment API.
Have more theatre rooms.
Have more movies available to buy tickets.
Have more items to sell (popcorn, drinks, …)
Possibility to allocate seats randomly not for that order.
Customers can buy more than 3 tickets.
