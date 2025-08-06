package org.firstinspires.ftc.teamcode.paths;

import static java.lang.Math.toRadians;

import com.acmerobotics.dashboard.FtcDashboard;
import com.acmerobotics.dashboard.config.Config;
import com.acmerobotics.dashboard.telemetry.MultipleTelemetry;
import com.pedropathing.follower.Follower;
import com.pedropathing.localization.Pose;
import com.pedropathing.pathgen.BezierCurve;
import com.pedropathing.pathgen.BezierLine;
import com.pedropathing.pathgen.PathChain;
import com.pedropathing.pathgen.Point;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;

import org.firstinspires.ftc.robotcore.external.Telemetry;
import org.firstinspires.ftc.teamcode.pedroPathing.constants.FConstants;
import org.firstinspires.ftc.teamcode.pedroPathing.constants.LConstants;

/**
 * This is
 */
@Config
@Autonomous (name = "Specimen", group = "Auto")
public class SpecimenDemo extends OpMode {
    private Telemetry telemetryA;

    private Follower follower;

    private PathChain path ;
    /**
     * This initializes the Follower and creates the PathChain for the "circle". Additionally, this
     * initializes the FTC Dashboard telemetry.
     */
    @Override
    public void init() {
        follower = new Follower(hardwareMap, FConstants.class, LConstants.class);
        follower.setStartingPose(new Pose(8,48, Math.toRadians(0)));




        path = follower.pathBuilder()

                    .addPath(
                            new BezierLine(
                                    new Point(8.000, 48.000, Point.CARTESIAN),
                                    new Point(53.355, 33.753, Point.CARTESIAN)
                            )
                    )
                    .setTangentHeadingInterpolation()

                    .addPath(
                            new BezierLine(
                                    new Point(53.355, 33.753, Point.CARTESIAN),
                                    new Point(55.363, 29.546, Point.CARTESIAN)
                            )
                    )
                    .setLinearHeadingInterpolation(Math.toRadians(-15), Math.toRadians(0))

                    .addPath(
                            new BezierCurve(
                                    new Point(55.363, 29.546, Point.CARTESIAN),
                                    new Point(17.689, 28.590, Point.CARTESIAN),
                                    new Point(15.968, 23.044, Point.CARTESIAN)
                            )
                    )
                    .setTangentHeadingInterpolation()
                    .setReversed(true)

                    .addPath(
                            new BezierLine(
                                    new Point(15.968, 23.044, Point.CARTESIAN),
                                    new Point(56.223, 24.574, Point.CARTESIAN)
                            )
                    )
                    .setTangentHeadingInterpolation()

                    .addPath(
                            new BezierLine(
                                    new Point(56.223, 24.574, Point.CARTESIAN),
                                    new Point(56.127, 17.402, Point.CARTESIAN)
                            )
                    )
                    .setLinearHeadingInterpolation(Math.toRadians(5), Math.toRadians(0))

                    .addPath(
                            new BezierLine(
                                    new Point(56.127, 17.402, Point.CARTESIAN),
                                    new Point(15.394, 12.143, Point.CARTESIAN)
                            )
                    )
                    .setTangentHeadingInterpolation()
                    .setReversed(true)




                .build();






        follower.followPath(path);

        telemetryA = new MultipleTelemetry(this.telemetry, FtcDashboard.getInstance().getTelemetry());
        telemetryA.addLine("This will do the specimen side");
        telemetryA.update();
    }

    /**
     * This runs the OpMode, updating the Follower as well as printing out the debug statements to
     * the Telemetry, as well as the FTC Dashboard.
     */
    @Override
    public void loop() {
        follower.update();


        follower.telemetryDebug(telemetryA);
    }
}
