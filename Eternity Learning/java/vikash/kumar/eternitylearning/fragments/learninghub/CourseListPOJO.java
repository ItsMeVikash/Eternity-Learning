package vikash.kumar.eternitylearning.fragments.learninghub;

public class CourseListPOJO {
    private String coursePicUrl,courseTitle,courseDescription;

    public CourseListPOJO() {
    }

    public CourseListPOJO(String coursePicUrl, String courseTitle, String courseDescription) {
        this.coursePicUrl = coursePicUrl;
        this.courseTitle = courseTitle;
        this.courseDescription = courseDescription;
    }

    public String getCoursePicUrl() {
        return coursePicUrl;
    }

    public void setCoursePicUrl(String coursePicUrl) {
        this.coursePicUrl = coursePicUrl;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }
}
