/*
 *  MicroEmulator
 *  Copyright (C) 2001 Bartek Teodorczyk <barteo@it.pl>
 *
 *  This library is free software; you can redistribute it and/or
 *  modify it under the terms of the GNU Lesser General Public
 *  License as published by the Free Software Foundation; either
 *  version 2.1 of the License, or (at your option) any later version.
 *
 *  This library is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *  Lesser General Public License for more details.
 *
 *  You should have received a copy of the GNU Lesser General Public
 *  License along with this library; if not, write to the Free Software
 *  Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */
 
package javax.microedition.lcdui;


public interface Choice {

  static final int EXCLUSIVE = 1;
  static final int MULTIPLE = 2;  
  static final int IMPLICIT = 3;
  

  int append(String stringPart, Image imagePart);
    
  void delete(int elementNum);
  
  Image getImage(int elementNum);
    
  int getSelectedFlags(boolean[] selectedArray_return);
  
  int getSelectedIndex();
  
  String getString(int elementNum);
    
  void insert(int elementNum, String stringPart, Image imagePart);
  
  boolean isSelected(int elementNum);
  
  void set(int elementNum, String stringPart, Image imagePart);
  
  void setSelectedFlags(boolean[] selectedArray);
  
  void setSelectedIndex(int elementNum, boolean selected);
  
  int size();
  
}

