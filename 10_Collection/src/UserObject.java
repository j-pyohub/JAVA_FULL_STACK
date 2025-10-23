
public class UserObject {
	private String name;
	
	public UserObject(String name) { //변수명은 바꿀 수 있음
		this.name = name;
	}

	@Override
	public String toString() {
		return "name=" + name;
	}

	@Override
	public int hashCode() { //최종 literal 값의 주소 체계를 연산해 놓은 것
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) { //boolean  ==> equals와 hashCode 둘 다 있어야 중복 체크 가능
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserObject other = (UserObject) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	
	
}
