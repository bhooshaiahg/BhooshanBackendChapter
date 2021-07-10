Singtel

I have created 4 source folders by naming as sectionA,sectionB,sectionC and sectionD which will have code for the corresponding inside sections questions.

A. Let’s start with the basics

	1. 	Can you implement the sing() method for the bird?
		Yes, i have implemented sing() method in Bird class and tested using 
		SectionASection1Solution class.
		1. How did you unit test it?
			Configure JUNIT and write JUNIT test class with setup() and test
			solutioin class methods
		2.How did you optimize the code for maintainability?
			* Creat 4 different interfaces for ISing,IWalk,IFly and 
				ISwim all actions
			* write abstract animal class by implementing all the 4 Interfaces
			* define implementation to swim and walk methods
			* declare sing and fly methods as abstracts which can be different
			  implementation for all Bird classes.
			PF optimised source code under section1.question2s
	2. Now, we have 2 special kinds of birds: the Duck and the Chicken
		Can you implement them to make their own special sound?
		Yes,PF source code for both under section2 inside sectionA 
		source folder. Both birds uses a AbstractAnimalClass 
		super class inherited common method by sending corresponding 
		message to display.
	3. Now how would you model a rooster? 
		1. A rooster says: “ Cock-a-doodle-doo ”
			PFA source code for the same.
		2. How is the rooster related to the chicken?
			Rooster is sub class to the chicken. its "is-a" relation.
		3. Can you think of other ways to model a rooster without
			using inheritance?
			PFA source code for the same.
	4. Can you model a parrot? We are specifically interested in three
		parrots, one that lived in a house with dogs one in a house with
		cats , the other lived on a farm next to the rooster.
		PFA source code
		Implemented using composition and abstraction by "has-a" relation
		between them.

B. Model fish as well as other swimming animals

	1. In addition to the birds, can you model a fish?
		PF source code, Fish extends AbstractAnimal class which can only swim
		and has size and color properties
	2. Can you specialize the fish as a Shark and as a Clownfish?
		yes, define both SharkFish and ClownFish with their size and colors
		and actions.
		PF source code for the same to answer
	3. Dolphin s are not exactly f ish, yet, they are good swimmers
		1. Can you model a dolphin that swims without inheriting from 
			a fish class?
			Yes,Write a Dolphin by implementing AbstractAnimal Class and
			can swim.
		2.How do you avoid duplicating code or introducing unneeded overhead?
			To answer this, implement all the common and repeated code in
			Base class and use wherever required.
C. Model animals that change their behaviour over time

	1. Can you model a butterfly?
		Yes, implement Butterfly by extending Abstract Animal Class which
		can fly.
	2. Can you optimize your model to account for the metamorphosis 
		from caterpillar to butterfly?
		Yes, Write a new class Metamorphosis to change Caterpillar to
		ButterFly and use this method in test class by passing caterpillar
		object which returns ButterFly.
		PF source code TestSectionC class for the same.
D. Counting animals

	1. Can you share the code to count:
		1. How many of these animals can fly? 
		2. How many of these animals can walk?
		3. How many of these animals can sing?
		4. How many of these animals can swim? 
		
		Yes, PF AnimalCounter class which will create all array of
		AbstractAnimals by passing its all implemented classes which has
		boolean return whether can fly or walk or sing or swim. So based
		true find all the actions count.
		
		PF source code for sectionD for the same.
		
		
	
	
		
		
		


