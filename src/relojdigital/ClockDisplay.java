/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relojdigital;

/**
 * La clase ClockDisplay implementa una pantalla de reloj digital para
 * un reloj de 24 horas, estilo europeo. El reloj muestra las horas
 * y los minutos. El rango del reloj es de 00:00 (medianoche) a 23:59.
 *
 * La pantalla del reloj recibe "pulsos" (a través del método timeTick)
 * cada minuto y reacciona incrementando la pantalla. La hora sube cuando
 * los minutos vuelven a cero.
 *
 * @author Xavi Alberto Lozano Palos 10/11/2025 
 */
public class ClockDisplay {
    private NumberDisplay hours;
    private NumberDisplay minutes;
    private String displayString; // simula la pantalla real

    /**
     * Constructor por defecto: inicializa el reloj en 00:00.
     */
    public ClockDisplay() {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        updateDisplay();
    }

    /**
     * Constructor que permite fijar una hora inicial.
     */
    public ClockDisplay(int hour, int minute) {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        setTime(hour, minute);
    }

    /**
     * Avanza el reloj un minuto.
     */
    public void timeTick() {
        minutes.increment();
        if (minutes.getValue() == 0) {
            hours.increment();
        }
        updateDisplay();
    }

    /**
     * Ajusta el reloj a la hora y minuto dados.
     */
    public void setTime(int hour, int minute) {
        hours.setValue(hour);
        minutes.setValue(minute);
        updateDisplay();
    }

    /**
     * Devuelve la hora actual en formato HH:MM.
     */
    public String getTime() {
        return displayString;
    }

    /**
     * Actualiza la cadena que representa la hora.
     */
    private void updateDisplay() {
        displayString = hours.getDisplayValue() + ":" + minutes.getDisplayValue();
    }
}