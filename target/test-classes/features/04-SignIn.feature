@SignIn @Dev
Feature: Sign In
	User want to Sign In

  @SignInGoogle
  Scenario: User Sign in with Google Account
    Given User on the Cicle App Page
    When User Sign In with Google Account
    Then User will be direct on the dashboard