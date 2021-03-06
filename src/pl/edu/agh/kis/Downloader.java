package pl.edu.agh.kis;

import java.io.OutputStream;
import java.io.InputStream;

/**
 * Interfejs, kt�rego implementacje bior� udzia� przy pracy w�tk�w DownloadThread
 * umo�liwiaj�c udost�pnienie odpowiednich strumieni wej�cia oraz wyj�cia, nie k�opocz�c
 * w�tk�w DownloadThread o spos�b w jaki strumienie ��cz� si� z odpowiednimi danymi
 * co daje dobr� elastyczno�� do testowania DownloadThread przy u�yciu plik�w jak
 * i mo�liwo�� dobrego odseparowania logiki w�tk�w pobieraj�cych od niskopoziomowej
 * komunikacji z serverem.
 * @author Szymon Majkut
 * @version 1.5
 *
 */
public interface Downloader {

	/**
	 * Funkcja odpowiada za utworzenie strumieni oraz ich w�a�ciwe pod��czenie
	 * informuje o powodzeniu swojego dzia�ania.
	 * @param hostName nazwa hosta na rzecz kt�rego inicjujemy obiekt.
	 * @return informacja o powodzeniu zainicjowania strumieni.
	 */
	public boolean initDownloader(String hostName);
	
	/**
	 * Funkcja ma za zadanie zwraca� strumie� wyj�ciowy przechowywany w implementacji.
	 * interfejsu.
	 * @return strumie� wyj�ciowy przechowywany w implementacji interfejsu.
	 */
	public OutputStream getOutputStream();
	
	/**
	 * Funkcja ma za zadanie zwraca� strumie� wej�ciowy przechowywany w implementacji.
	 * interfejsu.
	 * @return strumie� wej�ciowy przechowywany w implementacji interfejsu.
	 */
	public InputStream getInputSteam();
}
