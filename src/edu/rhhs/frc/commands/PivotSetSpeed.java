/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.rhhs.frc.commands;

/**
 *
 * @author bselle
 */
public class PivotSetSpeed extends CommandBase {
    
    private double m_motorSpeed;
    
    public PivotSetSpeed(double motorSpeed) {
        m_motorSpeed = motorSpeed;
        requires(getPivot());
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        if (m_motorSpeed != 0.0) {
            getPivot().setPivotSpeed(m_motorSpeed);
        }
        else {
            getPivot().stopPivot();
        }
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
