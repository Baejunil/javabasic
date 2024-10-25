package phonebook;

import java.util.ArrayList;
import java.util.List;

//Model
public class PhoneBookService {
	private List<Person> persons=new ArrayList<>();
	
	public List<Person> getPersons() {
		return persons;
	}

	//전화번호를 추가하면 리스트에 추가
	public void addPerson(Person p) {
		persons.add(p);
	}
	
	//전화번호 이름으로 검색
	public Person searchPerson(String name) {
		Person person=null;
		for(int i=0;i<persons.size();i++) {
			if(persons.get(i).getName().contains(name)) {
				persons.get(i).setIdx(i);
				person=persons.get(i);
			}
		}
		return person;
	}

}