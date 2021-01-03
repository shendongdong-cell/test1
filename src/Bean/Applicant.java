package Bean;
public class Applicant {
	private String applicantName;
	private String applicantId;
	private String applicantPwd;
	public Applicant() {
		super();
	}

	public Applicant(String applicantName, String applicantId, String applicantPwd) {
		super();
		this.applicantName = applicantName;
		this.applicantId = applicantId;
		this.applicantPwd = applicantPwd;
	}

	public String getApplicantName() {
		return applicantName;
	}

	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}

	public String getApplicantId() {
		return applicantId;
	}

	public void setApplicantId(String applicantId) {
		this.applicantId = applicantId;
	}

	public String getApplicantPwd() {
		return applicantPwd;
	}

	public void setApplicantPwd(String applicantPwd) {
		this.applicantPwd = applicantPwd;
	}
}
