# CucumberJava

#### CI/CD pipeline implemented (with secrets, dropdown using workflow_dispatch, html reports)

#### POM structure is implemented without Page factory(supported by selenium.support)

#### Tags are used in TestRunner file. tags are used with "or", "and", "and not"

#### Tags can be applied to Features, Scenarios, Examples but not to Background, Given, When, Then

#### Hooks are used (@Before and @After). Step Hooks, Scenario Hooks, Conditional Hooks(with tags)

#### By default "mvn test" will run the files with naming syntax: **/Test*.java, **/*Test.java, **/*TestCase.java

#### CLi commands: mvn test -Dcucumber.options = "Your options". Eg: --tags @smoke, --help, src/example.feature
