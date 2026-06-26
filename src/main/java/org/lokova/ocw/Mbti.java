package org.lokova.ocw;

public enum Mbti {

	ENTP(true, true, true, true), INTP(false, true, true, true), ENTJ(true, true, true, false),
	INTJ(false, true, true, false), ENFP(true, true, false, true), INFP(false, true, false, true),
	ENFJ(true, true, false, false), INFJ(false, true, false, false), ESTP(true, false, true, true),
	ISTP(false, false, true, true), ESFP(true, false, false, true), ISFP(true, false, false, false),
	ESTJ(true, false, true, false), ISTJ(false, false, true, false), ESFJ(true, false, false, false),
	ISFJ(false, false, false, false);

	private static final String[][] CP_NAMES = {
			{
					"浪巘"
			}, {
					"自由", "星夜"
			}, {
					"龙骨", "寰宇", "钟鼎"
			}, {
					"辩论", "理性", "君臣", "棋手"
			}, {
					"气氛", "翎羽", "油画", "彩虹", "长空"
			}, {
					"思维", "银河", "沉淀", "不安定", "童话", "吟游"
			}, {
					"号角", "量子纠缠", "领袖", "薄雾", "朝阳", "理想主义", "燃烧"
			}, {
					"光海", "太空垃圾", "观察", "神经脉络", "十四行诗", "咏叹调", "灯塔", "昆玉"
			}, {
					"公路", "游戏", "飓风", "温差", "熵增", "脉搏", "悬崖", "废墟", "长庚"
			}, {
					"暗巷", "修电脑", "飞鸟", "旁观", "坠落唤醒", "倾斜", "晚钟", "边缘", "焰火", "匕首"
			}, {
					"漂泊", "轻逸", "焚烧", "虚实", "霓虹", "混沌", "狂澜", "交际舞", "黄金", "金绿宝石", "烟草"
			}, {
					"锈斑", "旧梦", "颂歌", "玫瑰", "深蓝", "造梦", "救赎", "荆棘冠", "桑葚", "放逐", "彩绘玻璃", "藻井"
			}, {
					"审判", "黑箱", "暴君", "征服", "丝绒靠椅", "旧报纸", "宿命", "陨石", "史诗", "瑞士军刀", "煌煌", "石膏刻像"
			}, {
					"冰水混合物", "证明", "凝视", "傲娇", "极光", "挽歌", "山峦", "窄门", "海峡", "铁灰", "夜鹰", "液态化石", "岩层", "街道"
			}, {
					"河流", "憧憬", "日月", "等待", "雨过天晴", "生理盐水", "无字碑", "避风港", "存在", "熔化", "晨昏", "染料", "告诫", "刻度", "琥珀"
			}, {
					"倒吊人", "雨夜", "荫蔽", "荒谬", "杏花雨", "慰藉", "扶手", "潮汐", "单桅帆船", "磷光", "奔赴", "云霞", "冰镇甜点", "下午茶", "榴花白露",
					"烛光"
			}
	};

	public static String getCpName(Mbti m1, Mbti m2) {
		if (m1.ordinal() >= m2.ordinal()) {
			return CP_NAMES[m1.ordinal()][m2.ordinal()];
		} else {
			return CP_NAMES[m2.ordinal()][m1.ordinal()];
		}
	}

	private boolean isE;
	private boolean isN;
	private boolean isT;
	private boolean isP;

	Mbti(boolean isE, boolean isN, boolean isT, boolean isP) {
		this.isE = isE;
		this.isN = isN;
		this.isT = isT;
		this.isP = isP;
	}

	public boolean isBlue() {
		return !isN && !isP;
	}

	public boolean isE() {
		return isE;
	}

	public boolean isF() {
		return !isT;
	}

	public boolean isGreen() {
		return isN && !isT;
	}

	public boolean isI() {
		return !isE;
	}

	public boolean isJ() {
		return !isP;
	}

	public boolean isN() {
		return isN;
	}

	public boolean isP() {
		return isP;
	}

	public boolean isPurple() {
		return isN && isT;
	}

	public boolean isS() {
		return !isN;
	}

	public boolean isT() {
		return isT;
	}

	public boolean isYellow() {
		return !isN && isP;
	}

}