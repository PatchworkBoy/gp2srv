package x.mvmn.gp2srv.service.gphoto2.command;

import x.mvmn.log.api.Logger;

public class GP2CmdSetSettingByIndex extends AbstractGPhoto2Command {

	protected final String settingKey;
	protected final int valueIndex;

	public GP2CmdSetSettingByIndex(final String settingKey, final int valueIndex, final Logger logger) {
		super(logger);
		this.settingKey = settingKey;
		this.valueIndex = valueIndex;
	}

	@Override
	public String getCommandString() {
		return "set-config-index";
	}

	@Override
	public String[] getCommandParams() {
		return new String[] { settingKey + "=" + valueIndex };
	}

	public String getSettingKey() {
		return settingKey;
	}

	public int getValue() {
		return valueIndex;
	}
}