/*
 * Copyright(C) 2008-2009 Dmitriy Kumshayev. <dq@mail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package DataStructures.sf110;

/**
 * Immutable object representing a cell address (row,column).
 * {@link Object#equals(Object)} and {@link Object#hashCode()} methods
 * are overridden so that two <code>Reference</code> are equal
 * if and only if they refer the same row and column.
 *
 * @author Dmitriy Kumshayev
 */
public class Reference
{
  public final static int INFINITY = -1;

  private final int row;
  private final int column;

  public Reference(int row, int column)
  {
    this.row = row;
    this.column = column;
  }

  public int row()
  {
    return row;
  }

  public int column()
  {
    return column;
  }

  @Override
  public int hashCode()
  {
    final int prime = 31;
    int result = 1;
    result = prime * result + column;
    result = prime * result + row;
    return result;
  }

  @Override
  public boolean equals(Object obj)
  {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Reference other = (Reference) obj;
    if (column != other.column)
      return false;
    if (row != other.row)
      return false;
    return true;
  }

  @Override
  public String toString()
  {
    return row+","+column;
  }


}
