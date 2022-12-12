package Korean_Wave;

import java.util.*;
import java.io.FileWriter;
import java.io.Writer;
import Korean_Wave.enum_region;

public class koreanwave_per_region extends ask_continue{
	public static void gettxt() {
		while(true) {
			System.out.println("txt파일로 저장하고 싶은 지역의 번호를 입력해주세요(예시: 1)");
			System.out.println("----------------------------------");
			System.out.println("1. ASIA");
			System.out.println("2. EUROPE");
			System.out.println("3. NORTH AMERICA");
			System.out.println("4. SOUTH AMERICA");
			System.out.println("5. AFRICA");
			System.out.println("6. OCEANIA");
			System.out.println("돌아가시려면 '돌아가기' 를 입력해주세요.");
			System.out.println("주의: C:\\에 report.txt 파일이 이미 존재하는 경우, 선택한 국가의 파일로 덮어쓰게 되니 필요한 경우 파일을 복사하시어 따로 저장하시기 바랍니다.");
			System.out.println("----------------------------------");
			Scanner sc = new Scanner(System.in);
			String number = sc.next();
			if(number.equals("돌아가기")) {
				break;
				}
			enum_region selected = null;
			String report = null;
			switch(number) {   // 주석 6: 참조타입(열거타입)을 사용하는 switch문
			case "1":
				selected = enum_region.ASIA;
				report = "아시아에서 한류는, 한류가 서구권 국가로 퍼져나가기 전 마치 전초기지와도 같은 곳이었습니다.\n문화적으로도 비슷하고 신선한 한류는 중국, 일본에서도 인기를 끌었고, 동남아시아에서도 큰 인기를 얻었습니다.\n다만 동남아시아의 경우 다양한 문화로 인해 두루두루 많은 문화가 사랑받는다는 점을 고려할때, 한류가 온전히 저만의 특징으로 성공한 것은 아니라는 의견도 소수 존재합니다.";
				break;
			case "2":
				selected = enum_region.EUROPE;
				report = "2011년, 유럽에서의 한류 문화의 확산은 다른 한국의 대유럽 수출 산업의 기폭제가 될 수 있다는 판단에 유럽지역 공략에 들어섰습니다.\n2012년 싸이의 강남스타일 유행, 방탄소년단 등에 힘 입어 영국, 프랑스, 폴란드, 루마니아 등지에서 한국 문화가 자리잡고, 성장세를 보이고 있습니다. ";
				break;
			case "3":
				selected = enum_region.NORTH_AMERICA;
				report = "북미, 특히 미국에서는 한국 영화의 인지도가 높은데, 영화 올드보이가 미국 내에서 한국 영화의 인지도를 높이는 데 크게 기여했습니다.\n쿠엔틴 타란티노 감독이 직접 박찬욱 감독이 좋다고 발언할 정도로 미국 내에서 단단한 팬층이 있는 것으로 보입니다.\nK-POP 부문에서는 보아, 비 등이 진출을 시도했으나 성공하진 못하다가, 싸이의 강남스타일이 사상 최초로 빌보드 최상위권에 들어서면서 미국 내 한류의 뿌리를 생성하였으나, 아직은 주류 문화로 취급받진 못하였습니다.\n현재는 방탄소년단, 블랙핑크, 봉준호 감독 등으로 인해 미국 내에서 차츰 주류문화로 거의 자리잡았습니다. ";
				break;
			case "4":
				selected = enum_region.SOUTH_AMERICA;
				report = "남미 지역은 아시아, 유럽, 북미 지역에 비해 한류가 크게 영향을 미치진 못하고 있으나, 그래도 페루 등에서는 한류 문화가 꽤 영향을 미치고 있습니다.\n브라질 등 치안이 불안정한 지역에서 일부 학생들을 중심으로 K-POP이 퍼져나가는 등 의외의 부문에서도 한류의 씨앗이 뿌리내리는 중입니다.";
				break;
			case "5":
				selected = enum_region.AFRICA;
				report = "아프리카 지역은 낮은 인터넷 보급률 등으로 한류를 비롯한 다양한 문화가 퍼지기 어려운 편이지만, 의외로 국영 방송국에서 한국 드라마 일부를 수입해 방영하기도 하는 등 조금씩이지만 한류 문화가 퍼지고 있는 중입니다.\n다만 그 시간과 규모는 다른 지역에 비해 느리고 작을 것으로 예상됩니다.";
				break;
			case "6":
				selected = enum_region.OCEANIA;
				report = "";
				break;
			}
			System.out.println("현재 선택된 국가: " + selected);
			System.out.println("REPORT 저장 위치: C:\\");
			System.out.println("파일명: report");
			try {   // 주석 4: 출력 과정에서 예외가 발생할 경우를 대비하여 예외 처리를 사용하였습니다.
				Writer writer = new FileWriter("C:\\report.txt");   // 주석 8: 파일 입출력 사용, 해당하는 대륙의 간단한 한류 현황을 표시합니다.
				writer.write(report);
				writer.flush();
				writer.close();
			} catch(Exception e) {
				System.out.println("오류가 발생하였습니다. 다시 시도해주세요.");
			} finally {
				ask_continue.breakorcontinue();   // 주석 4: 예외가 발생하여도, 프로그램은 종료할 수 있도록 합니다.
			}
		}
	}
}
