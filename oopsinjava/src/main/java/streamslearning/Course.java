package streamslearning;

public class Course {
		
	private String name;
		private String courseType;
		private int noOfStudents;
		private int reviewScore;
		
		public Course(String name, String courseType, int reviewScore, int noOfStudents) {
			this.name = name;
			this.courseType = courseType;
			this.noOfStudents = noOfStudents;
			this.reviewScore = reviewScore;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getCourseType() {
			return courseType;
		}

		public void setCourseType(String courseType) {
			this.courseType = courseType;
		}

		public int getNoOfStudents() {
			return noOfStudents;
		}

		public void setNoOfStudents(int noOfStudents) {
			this.noOfStudents = noOfStudents;
		}

		public int getReviewScore() {
			return reviewScore;
		}

		public void setReviewScore(int reviewScore) {
			this.reviewScore = reviewScore;
		}

		@Override
		public String toString() {
			return "[" + name + ", " + courseType + ", " + noOfStudents
					+ ", " + reviewScore + "]";
		}
		
}
