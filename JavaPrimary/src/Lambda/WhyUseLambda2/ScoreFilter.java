package Lambda.WhyUseLambda2;

import Lambda.WhyUseLambda.Student;

public class ScoreFilter implements StudentFilter {
    @Override
    public boolean compare(Student student) {
        return student.getScore()>75;
    }
}
