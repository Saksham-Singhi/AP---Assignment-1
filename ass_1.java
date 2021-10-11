package ap_ass1;

import java.util.ArrayList;
import java.util.Scanner;



public class ass_1 {
	
	
	static Scanner s=new Scanner(System.in);

	public static class vax {
		 String name;
		 int doses;
		 int gap;
		
		static ArrayList<vax> vaxs = new ArrayList<vax>();
		
		vax(String _name, int _doses, int _gap){
			this.name = _name;
			this.doses = _doses;
			this.gap = _gap;
		}
		
		public static void reg_vax(String _name, int _doses, int _gap) {
			vaxs.add(new vax(_name,  _doses,  _gap));
		}
		
		
		public static vax get_vax(String _name, int _doses, int _gap) {
			return new vax(_name,  _doses,  _gap);
		}
		
		public static void add_vax(vax _vaxx) {
			vaxs.add(_vaxx);
		}
		
		public static boolean namcheck(String Nm) {
			for (int i = 0; i < vaxs.size(); i++) {
				if (vaxs.get(i).name == Nm) {
					return false;
				}
			}
			return true;
		}
		
		public static void reg_vax_f() {
			System.out.print("Vaccine Name: ");
			String _name = s.next();
			if (vax.namcheck(_name)==true) {
				System.out.print("Number of Doses: ");
				int _doses = s.nextInt();
				if (_doses != 1) {
					System.out.print("Gap between Doses: ");
					int _gap = s.nextInt();
					reg_vax(_name, _doses, _gap);
					System.out.println("Vaccine Name: " + _name + ", Number of Doses: " + _doses + ", Gap between Doses: " + _gap);
				} else {
					reg_vax(_name, 1, 0);
					System.out.println("Vaccine Name: " + _name + ", Number of Doses: " + 1 + ", Gap between Doses: " + 0);
				}
			} else {
				System.out.println("Name must be unique");
			}
		}
		
		public static vax name_search(String nam) {
			for (int i = 0; i < vaxs.size(); i++) {
				if (vaxs.get(i).name == nam) {
					return vaxs.get(i);
				}
			}
			return null;
		}
		
		public static void vax_hp(String v_name) {
			ArrayList<hp> hospi = new ArrayList<hp>();
			vax _vax = vax.name_search(v_name);
			for (slot s : slot.slots) {
				if (s.vaxx == _vax) {
					hospi.add(s.hosp);
				}
			}
			for (hp hpi : hospi) {
				System.out.println(String.format("%06d", hpi.iD) + " " + hpi.name);
			}
			
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
		    int n = 111111;
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
		
		
		public static void reg_hosp(String _name, int _pincode, int _iD) {
			hosps.add(new hp(_name, _pincode, _iD));
		}
		
		public static hp get_hosp(String _name, int _pincode, int _iD) {
			return new hp(_name, _pincode, _iD);
		}
		
		public static void add_hosp(hp _hosp) {
			hosps.add(_hosp);
		}
		
		
		
		public static void reg_hosp_f() {
			System.out.print("Hospital Name: ");
			String _name = s.next();
			System.out.print("Pincode: ");
			int _pincode = s.nextInt();
			int x = get_iD();
			reg_hosp(_name, _pincode, x);
			System.out.println("Allocated Hospital ID is " + String.format("%06d", x));
			System.out.println("Hospital Name: " + _name + ", Pincode: " + _pincode + ", Unique iD: " + String.format("%06d", x));
		}
		
		public static hp id_search (int _iD) {
			hp _hosp = null;
			for (int i = 0; i < hp.hosps.size(); i++) {
				if(hp.hosps.get(i).iD == _iD) {
					_hosp = hp.hosps.get(i);}
			} return _hosp;
		}
		
		public static void pin_search (int pin) {
			for (int i = 0; i < hp.hosps.size(); i++) {
				if(hp.hosps.get(i).pincode == pin) {
					System.out.println(String.format("%06d", hp.hosps.get(i).iD) + " " + hp.hosps.get(i).name);}
			} 
		}
		
		
//		for (int i = 0; i < hp.hosps.size(); i++) {
//			System.out.println((i+1) + ". " + hp.hosps.get(i).name);
		
		//register hosp - generate iD
		//get hosp
		//dictionary type datatype based on keyvalue iD
	}
	
	public static class ctz {
		 String Name;
		 int age;
		 long ID;
		 vax vaxx;
		 int doses_rcvd;
		 slot myslot;
		 int status; //0 - registered, 1 - part. vax, 2 - full vax
		
		static ArrayList<ctz> ctzns = new ArrayList<ctz>();
		
		ctz(String _Name, int _age, long _ID, int _status){
			this.Name = _Name;
			this.age = _age;
			this.ID = _ID;
			this.status = _status;
		}
		
		public static void reg_ctz(String _Name, int _age, long _ID, int _status) {
			ctzns.add(new ctz(_Name, _age, _ID, _status));
		}
		
		public static ctz get_ctz(String _Name, int _age, long _ID, int _status) {
			return new ctz(_Name, _age, _ID, _status);
		}
		
		public static void add_ctz(ctz p) {
			ctzns.add(p);
		}
		
		public static void reg_ctz_f() { // add checks for age and unique id
			System.out.print("Citizen Name: ");
			String _Name = s.next();
			System.out.print("Age: ");
			int _age = s.nextInt();
			System.out.print("Unique ID: ");
			long _ID = s.nextLong();
			long lim = 999999999999L;
			if (_ID <= lim) {
				System.out.println("Name: " + _Name + ", Age: " + _age + ", Unique ID: " + String.format("%012d", _ID));
				if (_age >= 18) {
					reg_ctz(_Name, _age, _ID, 0);
					System.out.println("REGISTERED");
				} else {
					System.out.println("Citizen Must Be Over 18 Years Of Age.");
				}
			} else {
				System.out.println("Invalid ID");
			}
			
		}
		
		public static void check_status () {
			System.out.print("Enter Patient ID: ");
			long _ID = s.nextLong();
			ctz c = null;
			for (int i = 0; i < ctz.ctzns.size(); i++) {
				if(ctz.ctzns.get(i).ID == _ID) {
					c = ctz.ctzns.get(i);}
			} 
			if (c != null) {
			if (c.status == 0) {
				System.out.println("REGISTERED");
			} else if (c.status == 1) {
				System.out.println("PARTIALLY VACCINATED");
				System.out.println("Vaccine Given: " + c.vaxx.name );
				System.out.println("Number of Doses given: " + c.doses_rcvd);
				System.out.println("Next Dose due date: " + (c.myslot.day + c.vaxx.gap));
			} else if (c.status == 2) {
				System.out.println("FULLY VACCINATED");
				System.out.println("Vaccine Given: " + c.vaxx.name );
				System.out.println("Number of Doses given: " + c.vaxx.doses);
			}
			}
		}
		
		public static ctz id_search (long _ID) {
			ctz c = null;
			for (int i = 0; i < ctz.ctzns.size(); i++) {
				if(ctz.ctzns.get(i).ID == _ID) {
					c = ctz.ctzns.get(i);}
			} return c;
		}
		
		public static void book_slot() {
			System.out.print("Enter patient Unique ID: ");
			long _ID = s.nextLong();
			ctz c = id_search(_ID);
			if (c.status == 2) {
				System.out.println("You're already vaccinated");
			} else {
				System.out.println("1. Search by area");
				System.out.println("2. Search by Vaccine");
				System.out.println("3. Exit");
				System.out.println("Enter option:");
				int z = s.nextInt();
				if (z == 1) {
					System.out.print("Enter Pincode:");
					int pin = s.nextInt();
					hp.pin_search(pin);
					System.out.print("Enter hospital id: ");
					int _iD = s.nextInt();
					c.myslot = slot.slots_hp(_iD);
					if (c.status == 1 && c.myslot.vaxx != c.vaxx) {
						System.out.println(" Vaccine should match with prior dose");
					}
					else {
						if (c.status == 0) {
							c.vaxx = c.myslot.vaxx; 
							c.doses_rcvd ++;
							if (c.vaxx.doses == 1) {
								c.status = 2;
							} else {
								c.status = 1;
							}	
						} else if (c.status == 1){
							c.doses_rcvd ++;
							if (c.vaxx.doses == c.doses_rcvd) {
								c.status = 2;
							}
						}
					System.out.println(c.Name + " vaccinated with " + c.vaxx.name);
					}
				} else if (z == 2) {
					System.out.print("Enter Vaccine Name: ");
					String v_name = s.next();
					vax.vax_hp(v_name);
					System.out.print("Enter hospital id: ");
					int _iD = s.nextInt();
					c.myslot = slot.slots_hp(_iD);
					if (c.status == 1 && c.myslot.vaxx != c.vaxx) {
						System.out.println(" Vaccine should match with prior dose");
					}
					else {
						if (c.status == 0) {
							c.vaxx = c.myslot.vaxx; 
							c.doses_rcvd ++;
							if (c.vaxx.doses == 1) {
								c.status = 2;
							} else {
								c.status = 1;
							}	
						} else if (c.status == 1){
							c.doses_rcvd ++;
							if (c.vaxx.doses == c.doses_rcvd) {
								c.status = 2;
							}
						}
					System.out.println(c.Name + " vaccinated with " + c.vaxx.name);
					}
				} else if (z==3) {
					System.out.println("Exit");
				}
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
		
		public static ArrayList<slot> slots = new ArrayList<slot>();

		
		slot(hp _hosp, int _day, int _quant, vax _vaxx){
			this.hosp = _hosp;
			this.day = _day;
			this.quant = _quant;
			this.vaxx = _vaxx;
		}
		
		public static void reg_slot(hp _hosp, int _day, int _quant, vax _vaxx) {
			slots.add(new slot(_hosp, _day, _quant, _vaxx));
		}
		
		public static slot get_slot(hp _hosp, int _day, int _quant, vax _vaxx) {
			return new slot(_hosp, _day, _quant, _vaxx);
		}
		
		public static void add_slot(slot _slot) {
			slots.add(_slot);
		}
		
		
		
		public static void reg_slot_f(int _iD) {
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
			reg_slot(_hosp, _day, _quant, _vax);
			System.out.println("Slot added by Hospital " + String.format("%06d", _hosp.iD) + " for Day: " + _day + ", Available Quantity: " + _quant + " of Vaccine " + _vax.name);
		}
		
//		public static slot id_search (int _iD) {
//			hp _hosp = null;
//			for (int i = 0; i < hp.hosps.size(); i++) {
//				if(hp.hosps.get(i).iD == _iD) {
//					_hosp = hp.hosps.get(i);}
//			} return _hosp;
//		}
		
		public static void slots_by_hosp() {
			System.out.print("Hospital ID: ");
			int _iD = s.nextInt();
			hp _hosp = hp.id_search(_iD);
			for (slot x : slot.slots) {
				if( x.hosp == _hosp) {
					System.out.println("Day: " + x.day + " Vaccine: " + x.vaxx.name + " Available Qty: " + x.quant);
				}
			}
		}
		
		public static slot slots_hp(int _iD) {
			ArrayList<slot> slots_hp = new ArrayList<slot>();
			hp _hosp = hp.id_search(_iD);
			for (slot x : slot.slots) {
				if( x.hosp == _hosp) {
					slots_hp.add(x);
				}
			}
			for (slot x : slots_hp) {
					System.out.println(slots_hp.indexOf(x)+ "-> Day: " + x.day + " Vaccine: " + x.vaxx.name + " Available Qty: " + x.quant);
			}
			System.out.print("Choose Slot: ");
			int y = s.nextInt();
			return slots_hp.get(y);


			
			
		}
			
		
		//create slot
		//book slot
		//check slot or avail status
		
	}

	public static void main(String[] args) {
//		vax.reg_vax_f();
//		hp.reg_hosp_f();
//		ctz.reg_ctz_f();
//		slot.reg_slot_f();
//		slot.reg_slot_f();
//		ctz.book_slot();
//		ctz.check_status();
//		for (int i = 0; i < slot.slots.size(); i++) {
//			System.out.println((i+1) + ". " + slot.slots.get(i).hosp.iD + " " + slot.slots.get(i).day);}
//		vax v = vax.get_vax("a", 2, 2);
//		vax.add_vax(v);
//		hp h = hp.get_hosp("hosp", 234230, 123456);
//		hp.add_hosp(h);
//		slot.add_slot(h, 3, 7, v);
//		slot.add_slot(h, 4, 8, v);
		System.out.println("CoWin Portal initialized....");
		int m = 0;
		String menu = "---------------------------------\r\n"+ "1. Add Vaccine\r\n"+ "2. Register Hospital\r\n"+ "3. Register Citizen\r\n"+ "4. Add Slot for Vaccination\r\n"+ "5. Book Slot for Vaccination\r\n"+ "6. List all slots for a hospital\r\n"+ "7. Check Vaccination Status\r\n"+ "8. Exit\r\n"+ "---------------------------------";
		while (m != 8) {
			System.out.println(menu);
			m = s.nextInt();
			if (m == 1) {
				vax.reg_vax_f();
			} else if (m == 2) {
				hp.reg_hosp_f();
			} else if (m == 3) {
				ctz.reg_ctz_f();
			} else if (m == 4) {
				System.out.print("Hospital ID: ");
				int _iD = s.nextInt();
				System.out.print("Enter number of Slots to be added: ");
				int num = s.nextInt();
				for (int i = 0; i < num; i++) {
				slot.reg_slot_f(_iD);}
			} else if (m == 5) {
				ctz.book_slot();
			} else if (m == 6) {
				slot.slots_by_hosp();
			} else if (m == 7) {
				ctz.check_status();
			} else if (m == 8) {
				break;
			} 
		}
		
	}
	
}


