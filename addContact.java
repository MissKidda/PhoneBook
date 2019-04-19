package phoneBook;

//see ContactMethods for new methods using ArrayLists.

public class addContact {
	private static Person [] people;
	
	public void searchName (String fname) {
		for (int i=0; i< people.length; i++) {
			if(people[i].getFirstName().trim().toUpperCase().equals(fname.toUpperCase())) { 
				System.out.println(people[i]);
		}
	}
	
	
	}	
	
	public void removeRecord (String numDel) {

		int j=0,temp=0;
		for( int i = 0; i < people.length; i++) {
			if(numDel.toUpperCase().trim().equals(people[i].getContact().trim().toUpperCase())){
				temp =i;

			}
		}

		for (int k = temp; k < people.length-1; k++) {

			people[k] = people[k+1];
			j++;

		}
		people[people.length-1] = null;
	}
	
}
	

