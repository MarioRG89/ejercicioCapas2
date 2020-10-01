package com.mario.datos;

import com.mario.persona.dto.Persona;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AccesoDatos {

	public Persona consultaPersona(String nombre) throws IOException {
		
		File file = new File("C:\\Users\\mario\\Desktop\\ejercicioCapas2.txt");
		BufferedReader lector = new BufferedReader(new FileReader(file));
		String lineas;
		while((lineas = lector.readLine()) != null) {
			return anadePersona(lineas);
		}
		lector.close();
		return null;
		
		
	}

	/**
	 * @param lineas
	 * @return
	 */
	private Persona anadePersona(String lineas) {
		String []arrayPersona= lineas.split("-");
		Persona p = new Persona(arrayPersona[0], Integer.parseInt(arrayPersona[1]), Integer.parseInt(arrayPersona[2]));
		return p;
	}

	
}
