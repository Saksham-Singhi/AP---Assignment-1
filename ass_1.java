package ap_ass1;

import java.io.Reader;
import java.util.ArrayList;
import java.util.Scanner;



public class ass_1 {
	
	
	static Scanner s=new Scanner(System.in);

	static public class vax {
		String name;
		int doses;
		int gap;
		
		static ArrayList<vax> vaxs = new ArrayList<vax>();
		
		vax(String _name, int _doses, int _gap){
			this.name = _name;
			this.doses = _doses;
			this.gap = _gap;
		}
		
		static void reg_vax(String _name, int _doses, int _gap) {
			vaxs.add(new vax(_name,  _doses,  _gap));
		}
		
		
		static void reg_vax_f() {
			System.out.print("Vaccine Name: ");
			String _name = s.next();
			System.out.print("Number of Doses: ");
			int _doses = s.nextInt();
			System.out.print("Gap between Doses: ");
			int _gap = s.nextInt();
			reg_vax(_name, _doses, _gap);
			System.out.println("Vaccine Name: " + _name + ", Number of Doses: " + _doses + ", Gap between Doses: " + _gap);
		}
//		for (int i = 0; i < hp.hosps.size(); i++) {
//		System.out.println((i+1) + ". " + hp.hosps.get(i).name);
	
		
		
		//get vaccine
		//get doses
		//get gap
	}
	
	public static class hp {
		String name;
		int pincode;
		int iD; // String.format("%06d", number); does this while displaying to pad the int from 45 to 000045 

		
		static ArrayList<hp> hosps = new ArrayList<hp>();

		public static int get_iD() {
		    int n = 0;
		    for (hp x : hosps) {
		    	if (x.iD == n) {
		    		n++;
		    	}
		    }
		    return n;
		}
		
		hp(String _name, int _pincode, int _iD){
			this.name = _name;
			this.pincode = _pincode;
			this.iD = _iD; 
		}
		//constr with name and pincode
		
		
		static void reg_hosp(String _name, int _pincode, int _iD) {
			hosps.add(new hp(_name, _pincode, _iD));
		}
		
		static void reg_hosp_f() {
			System.out.print("Hospital Name: ");
			String _name = s.next();
			System.out.print("Pincode: ");
			int _pincode = s.nextInt();
			int x = get_iD();
			reg_hosp(_name, _pincode, x);
			System.out.println("Allocated Hospital ID is " + String.format("%06d", x));
			System.out.println("Hospital Name: " + _name + ", Pincode: " + _pincode + ", Unique iD: " + String.format("%06d", x));
		}
		
		static hp id_search (int _iD) {
			hp _hosp = null;
			for (int i = 0; i < hp.hosps.size(); i++) {
				if(hp.hosps.get(i).iD == _iD) {
					_hosp = hp.hosps.get(i);}
			} return _hosp;
		}
		
//		for (int i = 0; i < hp.hosps.size(); i++) {
//			System.out.println((i+1) + ". " + hp.hosps.get(i).name);
		
		//register hosp - generate iD
		//get hosp
		//dictionary type datatype based on keyvalue iD
	}
	
	static public class ctz {
		String Name;
		int age;
		long ID;
		int status; //0 - registered, 1 - unvax, 2 - part. vax, 3 - full vax
		
		static ArrayList<ctz> ctzns = new ArrayList<ctz>();
		
		ctz(String _Name, int _age, long _ID, int _status){
			this.Name = _Name;
			this.age = _age;
			this.ID = _ID;
			this.status = _status;
		}
		
		static void reg_ctz(String _Name, int _age, long _ID, int _status) {
			ctzns.add(new ctz(_Name, _age, _ID, _status));
		}
		
		static void reg_ctz_f() { // add checks for age and unique id
			System.out.print("Citizen Name: ");
			String _Name = s.next();
			System.out.print("Age: ");
			int _age = s.nextInt();
			System.out.print("Unique ID: ");
			long _ID = s.nextLong();
			System.out.println("Name: " + _Name + ", Age: " + _age + ", Unique ID: " + String.format("%012d", _ID));
			if (_age >= 18) {
				reg_ctz(_Name, _age, _ID, 0);
				System.out.println("REGISTERED");
			} else {
				System.out.println("Citizen Must Be Over 18 Years Of Age.");
			}
		}
		
		
		//register c - input ID
		//get c
		//get age
		//get ID (12 dig)
		//get status
		
		
	}
	
	static public class slot {
		hp hosp;
		//hosp iD
		int day;
		//day number
		int quant;
		//quant
		vax vaxx;
		//vaccine
		
		static ArrayList<slot> slots = new ArrayList<slot>();

		
		slot(hp _hosp, int _day, int _quant, vax _vaxx){
			this.hosp = _hosp;
			this.day = _day;
			this.quant = _quant;
			this.vaxx = _vaxx;
		}
		
		static void add_slot(hp _hosp, int _day, int _quant, vax _vaxx) {
			slots.add(new slot(_hosp, _day, _quant, _vaxx));
		}
		
		
		
		static void add_slot_f() {
			System.out.print("Hospital ID: ");
			int _iD = s.nextInt();
			hp _hosp = hp.id_search(_iD);
			System.out.print("Enter Day Number: ");
			int _day = s.nextInt();
			System.out.print("Enter Quantity: ");
			int _quant = s.nextInt();
			System.out.println("Select Vaccine: ");
			for (int i = 0; i < vax.vaxs.size(); i++) {
				System.out.println((i) + ". " + vax.vaxs.get(i).name);
			}
			int ii = s.nextInt();
			vax _vax = vax.vaxs.get(ii);
			
			System.out.println("Slot added by Hospital " + _hosp.iD + " for Day: " + _day + ", Available Quantity: " + _quant + " of Vaccine " + _vax.name);
		}
		
		//create slot
		//book slot
		//check slot or avail status
		
	}
	
	class UI {
		
	}

	public static void main(String[] args) {
		
	}
	
}


