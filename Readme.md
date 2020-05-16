<h1 align="center">Demonstrating Software Quality</h1>

# [Contents](#contents)

- [Product Backlog, Sprint & Task Estimation](#backlog)
  - [Product Backlog](#backl)
  - [Sprint](#sprin)
  - [Task Estimation](#taskest)
- [Test Driven Development](#tdd)
- [Test Coverage Metric](#tcm)
- [Team Version Control](#tvc)
- [Code-review Checklist](#coderev)

# Product Backlog, Sprints & Task Estimation<a name = "backlog"></a>

## Product Backlog <a name = "backl"></a>

This product backlog is an ordered list of everything that is known to be needed in this project. The most important imtems are shown at the top of the product backlog so I know what product features should be delivered first. How these task were estimated and prioritised will be discussed later in this reference guide. 

| Themes/Epics   | User Story No.    | As a user I want to be able to x  | Priority   | Task Estimation |
| --- | --- | --- | --- | --- |
| **Create Survey** | 1 | As a user of the program I want to be able to create up to 10 questions | 1 | M (3) |
| **Answer Survey** | 2 | As a user of the program I want to be able to view a list of surveys I can answer | 2 | M (3) |
| **Answer Survey** | 3 | As a user of the program I want to be able to select a survey by name | 4 | S (2) |
| **Answer Survey** | 4 | As a user of the program I want to be able to answer a specific survey | 3 | M (3) |
| **Survey Analytics** | 5 | As a user of the program I want to be able to view all of the answers for a specific survey | 6 | L (5) |
| **Survey Analytics** | 6 | As a user of the program I want to view the analytics for a specific survey | 7 | M (3) |
| **Survey Analytics** | 7 | As a user of the program I want to view analytics for a specific question | 8 | M (3) |
| **Menu** | 8 | As a user of the program I want to be able to view the main menu to create a survey, answer a survey and view results of a survey | 5 | XS (1) |

[Top](#contents)
## Sprints <a name = "sprin"></a>
A sprint is a set period of time (generally max of one month) during which specific work has to be completed. To create a sprint you must first figure out the user requirements (features of the software program) and prioritise these tasks by estimating how long you think each task will take. For the task estimation I have used Three point estimation which will be discussed later in this reference guide. 

In this project there will be two sprints. Each sprint is considered a mini project and has a clear goal of what is to be built. Once the sprint begins no changes should be made that would endanger the sprint goal. Scope may be clarified and re-negotiated between the Product Owner and Development team as issues arise. (For this project the project specification is the product owner). The second sprint will start immediately after the conclusion of the previous sprint. 

### Sprint 1
| User Story No.   | Task Estimation   | Priority   | Status   | Hours Remaining | Actual Time Taken |
| --- | --- | --- | --- | --- | --- |
| 1 | M (3) | 1 | To Do | ... | ... |
| 2 |  M (3) | 2 | To Do | ... | ... |
| 4 | M (3) | 3 | To Do | ... | ... |
| 3 | S (2) | 4 | To Do | ... | ... |
<h4 align="center">- Total Task Estimation for Sprint One = 11</h4>
<h4 align="center">- Max Team Capacity per sprint = 12</h4>

### Sprint 2
| User Story No.   | Task Estimation   | Priority   | Status   | Hours Remaining | Actual Time Taken |
| --- | --- | --- | --- | --- | --- |
| 8 | S (1) | 5 | To Do | ... | ... |
| 5 | L (5) | 6 | To Do | ... | ... |
| 6 | M (3) | 7 | To Do | ... | ... |
| 7 | M (3) | 8 | To Do | ... | ... |

<h4 align="center">- Total Task Estimation for Sprint Two = 12</h4>
<h4 align="center">- Max Team Capacity per sprint = 12</h4>

[Top](#contents)

## Task Estimation<a name = "taskest"></a>
For task estimation I decided to use the T-Shirt estimation technique. T-shirt sizing is one of the Story point sizing techniques used in agile/scrum projects.

By initally expelling the numerical score when estimating a task size, the development team is allowed to think in a more dynamic manner about the exertion associated with a story. The sizes will, after estimation, correlate to a numerical value.

Items are clasified into the following categories: 

### Criteria for T-Shirt Sizing estimation
| Task complexity (T-Shirt Size)  | Task Estimation Number | 
| --- | --- | 
| Extra small | 1 | 
| Small |  2 | 
| Medium | 3 | 
| Large | 5 | 
| Extra Large | 8 |

As this assignment was not a team development project I had to estimate the sizes of tasks myself. To do this I set some criteria to follow when estimating a task such as does the story point require:

- Any calculations?
- Require a test?
- Use a loop?
- Use a function?
- Require a collection?
- Require Inheritance?

Depending on the answers to these questions and using my previous experience of Java tasks are deemed as either being XS, S, M, L, XL. 

My maximum team capacity per sprint is = 12. This, I feel, is a realistic target for each respective sprint.

[Top](#contents)
# Test Driven Development<a name = "tdd"></a>
Test-driven development (TDD) is a software development process that relies on the repetition of a very short development cycle: the first thing the developer writes is an initially failing automated test case, then produces the minimum amount of code to pass the test and finally refactors the code to be of an acceptable standard. 

# Test Coverage Metric<a name = "tcm"></a>

# Team Version Control<a name = "tvc"></a>

# Code-review Checklist<a name = "coderev"></a>