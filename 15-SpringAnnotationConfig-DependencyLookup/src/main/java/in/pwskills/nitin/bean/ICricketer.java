package in.pwskills.nitin.bean;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;


@Component
public interface ICricketer {
	
	@Lookup
	public abstract CricketBat createCricketBat();
	
	public default void fielding() {
		System.out.println("ICricketer.fielding() :: cricketer is doing fielding...");
	}
	
	public default void bowling() {
		System.out.println("ICricketer.bowling() :: cricketer is doing bowling...");
	}
	
	public default void wicketKeeping() {
		System.out.println("ICricketer.wicketKeeping() :: cricketer is doing wicketkeeping...");
	}
	
	public default void batting() {
		System.out.println("ICricketer.batting() :: cricketer is doinf batting...");
		CricketBat bat = createCricketBat();
		int runs  =  bat.scoreRuns();
		System.out.println("Cricketer is doing batting and his current score is :: "+ runs );
	}
}
