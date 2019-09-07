
Feature: First GET REST Assured test101

 
  Scenario: Test my Get Method101
    Given user start the rest asured test
    When user hit the get request
    Then user checks the "30" count or size
		Then user checks data at  path "MRData.CircuitTable.Circuits[0].circuitId" having value "albert_park" in jason
		Then user checks data at  path "MRData.CircuitTable.Circuits[1].country" having value as "USA" in jason
		
		
		
		##try for array
##Then user checks data at  path "MRData.CircuitTable.Circuits.circuitId" having value "albert_park" in jason		