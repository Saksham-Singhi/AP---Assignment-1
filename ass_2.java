package ap_assignments;

public class ass_2 {
	
	interface common {
		void view_lecture_materials();
		void view_assessments();
		void view_comments();
		void add_comments();
		void logout();
	}
	
	class instructor implements common {

		@Override
		public void view_lecture_materials() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void view_assessments() {
			// TODO Auto-generated method stub
			
		}
		
		public void grade_assessments() {
		}
		
		public void close_assessment() {
		}

		@Override
		public void view_comments() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void add_comments() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void logout() {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	class student implements common {

		@Override
		public void view_lecture_materials() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void view_assessments() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void view_comments() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void add_comments() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void logout() {
			// TODO Auto-generated method stub
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
