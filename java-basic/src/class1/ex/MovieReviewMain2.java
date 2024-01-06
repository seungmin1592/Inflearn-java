    package class1.ex;

import com.sun.source.doctree.SinceTree;

public class MovieReviewMain2 {
    public static void main(String[] args) {
        MovieReview[] movieReviews = new MovieReview[2];

        MovieReview inception = new MovieReview();
        inception.title = "인셉션";
        inception.review = "인생은 무한 루프";
        movieReviews[0] = inception;

        MovieReview aboutTime = new MovieReview();
        aboutTime.title = "어바웃타임";
        aboutTime.review = "인생 시간 영화";
        movieReviews[1] = aboutTime;

        for (MovieReview mr : movieReviews) {
            System.out.println("영화 제목 : " + mr.title + " 리뷰 : " + mr.review);
        }
    }
}
