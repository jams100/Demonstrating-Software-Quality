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
EclEmma is a free Java code coverage tool for Eclipse. It brings code coverage analysis directly into the Eclipse workbench. 

- Fast test cycle: Launches from within the workbench like JUnit test runs can directly be analysed for code coverage. 
- Rich coverage analysis: Coverage results are immediately summarised and highlighted in the Java source code editors.
- Non-invasive: EclEmma does not require any modifications of your projects or performing any other setup. 

<h3>To Run EclEmma</h1>

<p align="center"><img src="https://i.postimg.cc/CKzYQ4cY/Run.png" width="350" height="50"></p>
To launch EclEmma you simply have to click the run button as pictured in the workbench toolbar. It is called coverage mode and works exactly like the existing Run and Debug modes.

<h3>After Running EclEmma</h1>
<p align="center"><img src="https://i.postimg.cc/3xjnHMbF/Test-Coverage-Before.png" width="500" height="250"></p>

Once EclEmma is run you'll see the code that is covered by the tests in percentage terms. 

<h3>After Refactoring Code</h1>
<p align="center"><img src="https://i.postimg.cc/3xjnHMbF/Test-Coverage-Before.png" width="500" height="250"></p>

After making the relevant changes to the code those percentages above would've increased. I had a problem cloning my work from Vs Code to eclipse so I had to manually re add the files to eclipse and then run EclEmma hence all the tests aren't there.

# Team Version Control<a name = "tvc"></a>
Github/Gitflow used as version control in this project 
<h3>What is version control?</h3>
Version control systems are a category of software tools that help a software team manage changes to source code over time. Version control software keeps track of every modification to the code in a special kind of database. If a mistake is made, developers can turn back the clock and compare earlier versions of the code to help fix the mistake while minimising disruption to all team members.

<h3>My Branches</h3>

- Master branch: Is the main head branch of the project. It contains all the code and documentation. All the other branches merge into this branch, only pull requests should be performed.

- Documentation branch: The documentation branch contains several other branches such as the product backlog branch and the team-version control branch. The documentation branch will eventually merged back into the Master branch

- Develop branch: The develop branch contains all the development code, the survey creation branch is also merged back into this branch.

(Note I did encounter some problems with branching)
<h3>Benefits of Version Control</h3>

1. **History of files** A complete long-term change history of every file. Changes to files can include the creation and deletion of files as well as edits to their contents. Having the complete history enables going back to previous versions to help in root cause analysis for bugs and it is particularly crucial when needing to fic problems in older versions of software. 

2. **Branching & Merging** Individuals working on their own can benefit from the ability to work on independent streams of changes. Creating a branch in GitHub keeps multiple streams of work independent from each other, whilst also offering the ability to merge the work back together. Branching is particularly useful when doing a team project as different people can work on different features and then integrate them together at the end.

3. **Tracing** Being able to trace each change made to the software is particularly useful for identifying the root cause analysis of any bugs etc. Having the history of the code at your fingertips when your reading the code can significantly aid in understanding what a feature is doing and why it is doing it that way. Tracing could be particularly helpful if you were working with legacy code.

# Code-review Checklist<a name = "coderev"></a>
<h3>What is a code review?</h3>
A code review is a software quality assurance activity in which one or several people check a program mainly by viewing and reading parts of its source code. The main aim of a code review is to eliminate bugs and improve the overall quality of the code. Conducting code reviews have been shown to accelerate the software development process.

<h3>Detailed code-review checklist</h3>

1. **Coding best practices**: 
- Eliminate hard coding, use constraints
- Comments: Do not write comments for what you are doing but instead why you are doing it
- Avoid multiple if/else blocks
- Use framework features, where possible instead of writing custom code

2. **Code Formatting**:
- Ensure proper naming conventions
- Use alignments and proper white spacing
- Ensure code fits into the standard 14-inch laptop screen to eliminate the need for horizontal scrolling
- Remove unnecessarily commented code

3. **Architecture**:
- Separation of concerns followed
  - Split into multiple layers e.g. Presentation, Business and Data layers
  - Split into respective files e.g. CSS, Javascript, HTML
- Design patterns: Use appropriate design patterns e.g. Command or Momento pattern depending on the problem and context
- Code is in sync with existing code patterns/technologies

4. **Non Functional Requirements**:
- Testability: The code should be easy to test. Refactor into a separate function if required.
- Reusability: DRY, Do not repeat yourself principal. The same code should not be repeated more than twice. 
- Extensibility: It should be easy to as enhancements with minimal change to the existing code. One component should be easily replaced by another component. 
- Reliability: Exception handling and disposing of unused resources.
- Security: Authentication, authorisation etc. Ensuring access modifiers are private and not public

The above code review checklist is not exhaustive but provides a direction to the code reviewer to conduct effective code reviews and deliver good quality code.

* An example of a [pull request] is (https://github.com/jams100/Demonstrating-Software-Quality/commit/3f670ce1bffcb801b3e9d25edf98bf3201eadd77).
