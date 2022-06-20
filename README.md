# payslip 

## Instruction
### 1.Requirement:
The user can fill in the corresponding information according to the system prompt,
and the system finally obtains the calculation result through calculation. The specific calculation logic is as follows:

•	pay period = per calendar month • gross income = annual salary / 12 months 
•	income tax = based on the tax table provided below 
•	net income = gross income - income tax 
•	super = gross income x super rate 

The following rates to calculate income tax: 

Taxable income 	Tax on this income 
$0 - $18,200    	Nil Nil
$18,201 - $37,000	19c for each $1 over $18,200 
$37,001 - $87,000	$3,572 plus 32.5c for each $1 over $37,000
$87,001 - $180,000	$19,822 plus 37c for each $1 over $87,000 
$180,001 and over 	$54,232 plus 45c for each $1 over $180,000 

### 2.Design Principles
There are some principles I follow when it comes to software design.
1.Open Close Principle
In order to make the program have good extensibility and maintainability, the software entity should be open for extension and closed for modification. 
That is to say, changes should be implemented by extension, not by modifying existing code.
2. Liskov Substitution Principle
Subclasses must fully implement the methods of the superclass; subclasses can have their own personality;
When overriding or implementing the method of the parent class, the input parameters can be enlarged
3. Dependence Inversion Principle
First, the top layer should not depend on the bottom layer, both should depend on its abstraction;
Second, abstraction should not depend on details, and details should depend on abstraction;
That is, the dependency between modules occurs through abstraction, and there is no direct dependency relationship between implementation classes, 
and the dependency relationship is generated through interfaces or abstract classes.
4. interface segregation principle
The interface should be as small as possible
The interface must have high cohesion, and high cohesion is to minimize the number of public methods published.
The interface should provide customized services for individuals, that is, only provide the methods that the visitor needs
5. Demeter Principle
A class should know as little as possible about the classes it needs to couple or call
6. Composite Reuse Principe
Try to use the synthetic method as much as possible, rather than the inheritance method

Summary: According to the requirements of the exercise, I design a system design that conforms to the principles and develop it according to the process.
For example, design the EmployeeData class to manage employee data, use private to reduce the number of publications, 
and produce dependencies through interfaces or abstract classes. 
The entire project life cycle adopts the waterfall model (the system is simple)
1, planning. 2. Demand analysis. 3. Software design. 4. Software development. 5. Software testing. 6. Software maintenance

### 3.Test
Junit test
Using only the main method for testing has the following disadvantages:

There can only be one main method, and the test code cannot be separated;
Test results and expected results are not printed.
Unit testing benefits:

Make sure a single method works properly;
If the method code is modified, just make sure its corresponding unit test passes;
The test code itself can be used as sample code;
All tests can be run automatically and analysis reports can be obtained.
Junit is a unit testing framework for Java programs. It has the following characteristics:

Use Asserts to test expected results;
Tests can be easily organized and run;
Test results can be easily viewed;
Common IDEs are integrated with Junit;
Can be easily integrated into Maven.

black box test
In the case of completely disregarding the internal structure and internal characteristics of the program,
the program interface is tested. It only checks whether the program functions are used normally according to the requirements and specifications,
and whether the program can properly receive input data and generate correct output information.
test1 and test2 are black box test results
![image](https://github.com/mantou1234/payslip/blob/main/test1.png)
![image](https://github.com/mantou1234/payslip/blob/main/test2.png)
