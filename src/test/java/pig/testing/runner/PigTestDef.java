package pig.testing.runner;

import java.util.ArrayList;
import java.util.Properties;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class PigTestDef {

	String id;
	String file;
	Properties args = new Properties();
	ArrayList<TestClass> tests = new ArrayList<TestClass>();
	ArrayList<String[]> hiveCli = new ArrayList<String[]>();
	
	static class TestClass {
	    Properties args;
	    String name;
        public Properties getArgs() {
            return args;
        }
        public void setArgs(Properties args) {
            this.args = args;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        
	}
	
    public ArrayList<String[]> getHiveCli() {
        return hiveCli;
    }

    public void setHiveCli(ArrayList<String[]> hiveCli) {
        this.hiveCli = hiveCli;
    }

    public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFile() {
		return file;
	}

	public void setFile(String file) {
		this.file = file;
	}

	public Properties getArgs() {
		return args;
	}

	public void setArgs(Properties args) {
		this.args = args;
	}

    public ArrayList<TestClass> getTests() {
        return tests;
    }

    public void setTests(ArrayList<TestClass> tests) {
        this.tests = tests;
    }

	
}