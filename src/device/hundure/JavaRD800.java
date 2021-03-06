package device.hundure;

public class JavaRD800
{
	public JavaRD800()
	{
	}
	static
	{
		System.loadLibrary("javaRD800");
	}
	public native int dc_init(int lPort,int lBaud);
	public native short dc_exit(int lDevice);
	public native short dc_card(int lDevice,short iMode,long[] pSnr);
	//public native short dc_card(int lDevice,short iMode,long pSnr);
	public native short dc_authentication(int lDevice,short iMode,short iSecNr);
	public native short dc_halt(int lDevice);
	public native short dc_read(int lDevice,short iAdr,char[] pData);
	public native short dc_write(int lDevice,short iAdr,char[] pData);
	public native String  dc_read(int lDevice,short iAdr,String pData);
	public native short dc_write(int lDevice,short iAdr,String pData);
		
	public native short dc_increment(int lDevice,short iAdr,int lValue);
	public native short dc_decrement(int lDevice,short iAdr,int lValue);
	public native short dc_initval(int lDevice,short iAdr,int lValue);
	public native short dc_readval(int lDevice,short iAdr,int[] pValue);
	public native short dc_transfer(int lDevice,short iAdr);
	public native short dc_restore(int lDevice,short iAdr);
	public native short dc_load_key(int lDevice,short iMode,short iSecNr,char[] pKey);
	public native short dc_beep(int lDevice,short iMsec);
	public native short dc_high_disp(int lDevice,short iOffset,short iDispLen,char[] pDispStr);
	public native short dc_request(int lDevice,short iMode,int[] pTagType);
	public native short dc_anticoll(int lDevice,short iBcnt,int[] pSnr);
	public native short dc_select(int lDevice,int lSnr,short[] pSize);
	public native short dc_gettime(int lDevice,char[] pTimeStr);
	public native short dc_gettimehex(int lDevice,char[] pTimeStr);
	public native short dc_settime(int lDevice,char[] pTimeStr);
	public native short dc_settimehex(int lDevice,char[] pTimeStr);
	public native short dc_setbright(int lDevice,short iBright);
	public native short dc_ctl_mode(int lDevice,short iMode);
	public native short dc_disp_mode(int lDevice,short iMode);
	public native short dc_cpureset(int lDevice,short[] pLen,char[] pData);
	public native short dc_cpuapdu(int lDevice,short iLen,char[] pSData,short[] pLen,char[] pRData);
	public native short dc_cpuapdusource(int lDevice,short iLen,char[] pSData,short[] pLen,char[] pRData);
	public native short dc_cpudown(int lDevice);
	public native short dc_swr_eeprom(int lDevice,int lOffset,int lLen,char[] pBuffer);
	public native short dc_srd_eeprom(int lDevice,int lOffset,int lLen,char[] pBuffer);
	public native short dc_disp_str(int lDevice,char[] pDispStr);
	public native short dc_setcpu(int lDevice,byte _Byte);
	
	public native short dc_reset(int lDevice, int _Msec);
	public native short dc_config_card(int lDevice, char cardtype);
	public native short dc_pro_reset(int lDevice,short[] rlen,char[] receive_data);
	public native short dc_pro_command(int lDevice , short slen,char[] sendbuffer,short[] rlen,char[] databuffer,short timeout);
	
}
