package jp.highreso.air.ane.getimei
{
	import flash.external.ExtensionContext;
	import flash.system.Capabilities;

	public class GetIMEI
	{
		private static var extContext:ExtensionContext = null;
		
		public function GetIMEI()
		{
			extContext = ExtensionContext.createExtensionContext("jp.highreso.air.ane.getimei", null);
		}
		
		/**
		 * androidかどうか判定
		 */
		public static function get isAndroid():Boolean
		{
			var manufacturer:String = Capabilities.manufacturer.toLowerCase();
			return manufacturer.indexOf("android") >= 0; 
		}

		/**
		 * IMEIを取得する
		 * androidのみ
		 * @return
		 */
		public function getIMEI():String {
			var imei:String = null;
			if (isAndroid) {
				imei = extContext.call("getIMEI") as String;
			}
			return imei;
		}
	}
}