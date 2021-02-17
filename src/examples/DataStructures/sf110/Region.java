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

public class Region
{
  private Reference start;

  private Reference end;

  public Region()
  {
  }

  public Region(Reference start, Reference end)
  {
    this.start = start;
    this.end = end;
  }

  public void setStartReference(Reference start)
  {
    this.start = start;
  }

  public Reference start()
  {
    return start;
  }

  public void setEndReference(Reference end)
  {
    this.end = end;
  }

  public Reference end()
  {
    return end;
  }

  /**
   * @return true if this Region contains the Region passed as an argument
   */
  public boolean contains(Region region)
  {
    return start.row() <= region.start.row()
            && start.column() <= region.start.column()
            && (end.row() == Reference.INFINITY || region.end.row() <= end.row())
            && (end.column() == Reference.INFINITY || region.end.column() <= end
            .column());
  }

  /**
   * @return true if this Region contains the reference
   */
  public boolean contains(Reference reference)
  {
    return start.row() <= reference.row()
            && (end.row() == Reference.INFINITY || reference.row() <= end.row())
            && start.column() <= reference.column()
            && (end.column() == Reference.INFINITY || reference.column() <= end
            .column());
  }

  @Override
  public String toString()
  {
    return start + "," + end;
  }

}
