package ap_ass1;

public class ass_1 {
	
	public class vax {
		String name;
		int doses;
		int gap;
		
		vax(){
			this.name = "";
			this.doses = 0;
			this.gap = 0;
		}
		
		vax(String _name, int _doses, int _gap){
			this.name = _name;
			this.doses = _doses;
			this.gap = _gap;
		}
		
		vax reg_vax(String _name, int _doses, int _gap) {
			return new vax(_name,  _doses,  _gap);
		}
		//get vaccine
		//get doses
		//get gap
	}
	
	public class hp {
		String name;
		int pincode;
		long iD;
		
		
		
		//constr with name and pincode
		
		//register hosp - generate iD
		//get hosp
		//dictionary type datatype based on keyvalue iD
	}
	
	public class ctz {
		String Name;
		int age;
		long ID;
		String status;
		
		ctz(String _Name, int _age, long _ID, String _status){
			this.Name = _Name;
			this.age = _age;
			this.ID = _ID;
			this.status = _status;
		}
		
		ctz reg_ctz(String _Name, int _age, long _ID, String _status) {
			return new ctz(_Name, _age, _ID, _status);
		}
		
		//register c - input ID
		//get c
		//get age
		//get ID (12 dig)
		//get status
		
		// wheh calling prog funtion, just append the ctz array with reg_ctz(...)
		
	}
	
	public class slot {
		hp hosp;
		//hosp iD
		int day;
		//day number
		int quant;
		//quant
		vax vaxx;
		//vaccine
		
		slot(hp _hosp, int _day, int _quant, vax _vaxx){
			this.hosp = _hosp;
			this.day = _day;
			this.quant = _quant;
			this.vaxx = _vaxx;
		}
		
		slot add_slot(hp _hosp, int _day, int _quant, vax _vaxx) {
			return new slot(_hosp, _day, _quant, _vaxx);
		}
		
		//create slot
		//book slot
		//check slot or avail status
		
	}
	
	class UI {
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
