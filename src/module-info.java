/**
 * 
 */
/**
 * @author Kerim
 *
 */
module Login {
	exports application;

	requires javafx.base;
	requires javafx.fxml;
	requires transitive javafx.graphics;
	requires javafx.controls;
	
	opens application;
}