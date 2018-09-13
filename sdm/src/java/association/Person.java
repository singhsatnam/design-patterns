package association;

import java.util.ArrayList;
import java.util.List;
import utilities.Range;

import static utilities.Utilities.print;

public class Person
{
    private List<List<BodyPart>> bodyParts;
    private List<BodyPart> headList;
    private List<BodyPart> limbsList;
    private List<BodyPart> torsoList;

    Person()
    {
        bodyParts = new ArrayList<List<BodyPart>>();
        headList = new ArrayList<BodyPart>();
        limbsList = new ArrayList<BodyPart>();
        torsoList = new ArrayList<BodyPart>();
        bodyParts.add(headList);
        bodyParts.add(limbsList);
        bodyParts.add(torsoList);
        this.addTorso(1);
        this.addHead(1);
    }

    void showAll()
    {
    }

    public void addHead(int count)
    {
        Head head = null;
        for(int i: new Range(count))
        {
            print("adding head");
            head = new Head("Head " + i);
            headList.add(head);
        }
    }
    public void addTorso(int count)
    {
        Torso torso = null;
        for(int i: new Range(count))
        {
            torso = new Torso("Head " + i);
            torsoList.add(torso);
        }
    }
    public void addLimbs(int count)
    {
        Limbs limbs = null;
        for(int i: new Range(count))
        {
            limbs = new Limbs("Head " + i);
            limbsList.add(limbs);
        }
    }
    public int getHeadCount()
    {
        return headList.size();
    }
    public int getLimbsCount()
    {
        return limbsList.size();
    }
    public int getTorsoCount()
    {
        return torsoList.size();
    }
    public void displayAllBodyParts()
    {
        for (List<BodyPart> bodyPartList: bodyParts)
        {
            for(BodyPart aPart: bodyPartList)
            {
                print(aPart.getName());
            }
        }
    }
    public void displayHeadList()
    {
        for(BodyPart heads: headList)
        {
            print(heads.getName());
        }
    }
}
