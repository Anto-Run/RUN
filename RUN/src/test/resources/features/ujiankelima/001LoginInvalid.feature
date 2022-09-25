Feature: Invalid Login in SHOPQA

  Scenario Outline: User login invalid
  	When User go to web SHOPQA
  	And User enter invalid <username> and <password> 
  	And User click button login
  	Then System check credentials login
  	
  Examples:
				  |username|password|
				|anda|didiada234$%|
				|andi|andi345@|
				|ando@gmail.com|ando567@|
  