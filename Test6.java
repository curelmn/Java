class Student {
        private String num;//学号
        private String name;//姓名
        private String sex;//性别
        private int age;//年龄
        private int count;//选课数
        private Course[] courses;//选课

        public String getNum() {
            return num;
        }

        public void setNum(String num) {
            this.num = num;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public Course[] getCourses() {
            return courses;
        }

        public void setCourses(Course[] courses) {
            this.courses = courses;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }


        public Student(String num, String name, String sex, int age, int count) {
            this.setNum(num);
            this.setName(name);
            this.setSex(sex);
            this.setAge(age);
            this.setCount(count);
        }


        public void selectOneCourse(Course course) {
            System.out.println(getName() + "选了一门 " + course.getCourseName() + "课程，得了" + course.getCourseScore() + "分");
            count++;
        }


        public void selectCourse(Course[] courses) {

            for (int i = 0; i < courses.length; i++) {
                selectOneCourse(courses[i]);
            }
        }


        public void printCount() {
            System.out.println(getName() + "一共选了" + getCount() + "门课程");
        }
    }


    class Course {
        private String courseName;
        private String courseNumber;
        private int courseTime;
        private int courseScore;

        public void setCourseName(String courseName) {
            this.courseName = courseName;
        }

        public String getCourseName() {
            return courseName;
        }

        public String getCourseNumber() {
            return courseNumber;
        }

        public void setCourseNumber(String courseNumber) {
            this.courseNumber = courseNumber;
        }

        public int getCouseTime() {
            return courseTime;
        }

        public void setCouseTime(int courseTime) {
            this.courseTime = courseTime;
        }

        public int getCourseScore() {
            return courseScore;
        }

        public void setCourseScore(int courseScore) {
            this.courseScore = courseScore;
        }


        public Course(String courseName, String courseNumber, int courseTime, int courseScore) {
            this.setCourseName(courseName);
            this.setCourseNumber(courseNumber);
            this.setCouseTime(courseTime);
            this.setCourseScore(courseScore);
        }
    }

    public class Test6 {
        public static void main(String[] args) {
            Student stu1 = new Student("001", "张三", "男", 18, 0);
            Student stu2 = new Student("002", "李四", "男", 19, 0);

            Course c1 = new Course("语文", "a001", 32, 90);
            Course c2 = new Course("数学", "a002", 64, 70);

            stu1.selectOneCourse(c1);
            stu1.printCount();
            stu1.selectOneCourse(c2);
            stu1.printCount();

            System.out.println();


            stu2.printCount();
            stu2.selectOneCourse(c2);
            stu2.printCount();
        }
    }

