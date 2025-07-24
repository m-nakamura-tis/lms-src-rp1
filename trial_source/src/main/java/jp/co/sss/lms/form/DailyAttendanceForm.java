package jp.co.sss.lms.form;

import java.util.LinkedHashMap;

import lombok.Data;

/**
 * 日次の勤怠フォーム
 * 
 * @author 東京ITスクール
 */
@Data
public class DailyAttendanceForm {

	/** 受講生勤怠ID */
	private Integer studentAttendanceId;
	/** 途中退校日 */
	private String leaveDate;
	/** 日付 */
	private String trainingDate;
	/** 出勤時間 */
//	@NotBlank
	private String trainingStartTime;
	/** 退勤時間 */
//	@NotBlank
	private String trainingEndTime;
	//Task.26 1-3-2
	/**出勤時間（時間）*/
//	@NotBlank
	private String trainingStartHour;
	/**出勤時間（時間）画面表示用*/
	private Integer trainingStartHhValue;
	/**出勤時間（分）*/
//	@NotBlank
	private String trainingStartMinute;
	/**出勤時間（分）画面表示用*/
	private Integer trainingStartMmValue;
	/**退勤時間（時間）*/
//	@NotBlank
	private String trainingEndHour;
	/**退勤時間（時間）画面表示用*/
	private Integer trainingEndHhValue;
	/**退勤時間（分）*/
//	@NotBlank
	private String trainingEndMinute;
	/**時間（分）画面表示用*/
	private Integer trainingEndMmValue;
	/** 中抜け時間 */
	private Integer blankTime;
	/** 中抜け時間（画面表示用） */
	private String blankTimeValue;
	/** ステータス */
	private String status;
	/** 備考 */
	private String note;
	/** セクション名 */
	private String sectionName;
	/** 当日フラグ */
	private Boolean isToday;
	/** エラーフラグ */
	private Boolean isError;
	/** 日付（画面表示用） */
	private String dispTrainingDate;
	/** ステータス（画面表示用） */
	private String statusDispName;
	/** LMSユーザーID */
	private String lmsUserId;
	/** ユーザー名 */
	private String userName;
	/** コース名 */
	private String courseName;
	/** インデックス */
	private String index;
	/**エラーメッセージ*/
	private LinkedHashMap<Integer, String> errorList;

}
