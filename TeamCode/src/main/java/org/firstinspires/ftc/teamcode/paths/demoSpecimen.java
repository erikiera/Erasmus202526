package org.firstinspires.ftc.teamcode.paths;

import static java.lang.Math.toRadians;

import com.pedropathing.pathgen.BezierCurve;
import com.pedropathing.pathgen.PathBuilder;
import com.pedropathing.pathgen.PathChain;
import com.pedropathing.pathgen.Point;

public class demoSpecimen {

        public static PathBuilder builder = new PathBuilder();

        public static PathChain line1 = builder
                .addPath(
                        new BezierCurve(
                                new Point(8.000, 48.000, Point.CARTESIAN),
                                new Point(28.207, 36.813, Point.CARTESIAN),
                                new Point(48.000, 36.000, Point.CARTESIAN)
                        )
                )
                .setConstantHeadingInterpolation(toRadians(0))
                .build();

        public static PathChain line2 = builder
                .addPath(
                        new BezierCurve(
                                new Point(48.000, 36.000, Point.CARTESIAN),
                                new Point(62.821, 33.371, Point.CARTESIAN),
                                new Point(59.092, 27.538, Point.CARTESIAN)
                        )
                )
                .setConstantHeadingInterpolation(toRadians(0))
                .build();

        public static PathChain line3 = builder
                .addPath(
                        new BezierCurve(
                                new Point(59.092, 27.538, Point.CARTESIAN),
                                new Point(48.574, 22.661, Point.CARTESIAN),
                                new Point(12.622, 19.888, Point.CARTESIAN)
                        )
                )
                .setConstantHeadingInterpolation(toRadians(0))
                .setReversed(true)
                .build();

        public static PathChain line4 = builder
                .addPath(
                        new BezierCurve(
                                new Point(12.622, 19.888, Point.CARTESIAN),
                                new Point(61.195, 31.363, Point.CARTESIAN),
                                new Point(58.327, 15.299, Point.CARTESIAN)
                        )
                )
                .setConstantHeadingInterpolation(toRadians(0))
                .build();








}
