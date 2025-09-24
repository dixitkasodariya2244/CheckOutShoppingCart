# CheckOutShoppingCart
## Project Description
### CheckOutShoppingCart is a Java project built using Test-Driven Development (TDD) that implements a simple checkout system for a fruit shop. The shop sells only apples and oranges, with the following pricing rules:

    Apple → 60p each
    Orange → 25p each

### Two checkout modes are supported:

### Basic Checkout → calculates the total cost with no discounts.

## Offer Checkout → applies special promotional offers:

    Buy One Get One Free on Apples
    3 for the price of 2 on Oranges

### The system is covered by JUnit 5 tests, and all features have been developed step-by-step following TDD principles (write failing test → implement code → refactor → repeat).

## Features

Simple checkout for lists of items (Apple, Orange).

### Robust error handling for:

  null input
  unknown items
  case and whitespace variations ("apple", " APPLE ", "Orange").
  
### Two pricing strategies:

  total(List<String>) → standard calculation
  totalWithOffers(List<String>) → promotional offers applied
## Tech Stack

### Language: Java 21
### Build Tool: Maven
### Testing: JUnit 5 (Jupiter)
### Methodology: Test-Driven Development (TDD)
