package jp.co.sss.lms.form;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

import lombok.Data;

/**
 * 勤怠フォーム
 * 
 * @author 東京ITスクール
 */
@Data
public class AttendanceForm {

	/** LMSユーザーID */
	private Integer lmsUserId;
	/** グループID */
	private Integer groupId;
	/** 年間計画No */
	private String nenkanKeikakuNo;
	/** ユーザー名 */
	private String userName;
	/** 退校フラグ */
	private Integer leaveFlg;
	/** 退校日 */
	private String leaveDate;
	/** 退校日（表示用） */
	private String dispLeaveDate;
	/** 中抜け時間(プルダウン) */
	private LinkedHashMap<Integer, String> blankTimes;
	/** 日次の勤怠フォームリスト */
	private List<DailyAttendanceForm> attendanceList;
	/**時間マップ（プルダウン）*/
	private LinkedHashMap<Integer, String> trainingTimeHh;
	/**分マップ（プルダウン）*/
	private LinkedHashMap<Integer, String> trainingTimeMi;
	/**エラーメッセージ*/
	private Set<String> errorList;
	/**エラー箇所（備考）*/
	private boolean[] note;
	/**エラー箇所（出勤時間）*/
	private boolean[] trainingStartHour;
	/**エラー箇所（退勤時間）*/
	private boolean[] trainingEndHour;
	/**エラー箇所（出勤分）*/
	private boolean[] trainingStartMinute;
	/**エラー箇所（退勤分）*/
	private boolean[] trainingEndMinute;
	/**エラー箇所（中抜け）*/
	private boolean[] blankTime;

}
