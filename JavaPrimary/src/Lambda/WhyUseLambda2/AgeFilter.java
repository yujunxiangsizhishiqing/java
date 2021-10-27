package Lambda.WhyUseLambda2;

import Lambda.WhyUseLambda.Student;

public class AgeFilter implements StudentFilter {
    @Override
    public boolean compare(Student student) {
        return student.getAge()>14;
    }
}
